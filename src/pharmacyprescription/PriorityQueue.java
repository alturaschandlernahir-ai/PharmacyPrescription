package pharmacyprescription;

/**
 * Array-based max-heap priority queue. Higher urgency is dequeued first.
 * Does not use java.util collections.
 */
public class PriorityQueue {

    private final Prescription[] heap;
    private int size;

    public PriorityQueue(int capacity) {
        this.heap = new Prescription[capacity];
        this.size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == heap.length;
    }

    public int size() {
        return size;
    }

    public boolean enqueue(Prescription prescription) {
        if (prescription == null || isFull()) {
            return false;
        }
        heap[size] = prescription;
        siftUp(size);
        size++;
        return true;
    }

    public Prescription dequeue() {
        if (isEmpty()) {
            return null;
        }
        Prescription highest = heap[0];
        size--;
        heap[0] = heap[size];
        heap[size] = null;
        if (size > 0) {
            siftDown(0);
        }
        return highest;
    }

    public Prescription searchById(String id) {
        if (id == null) {
            return null;
        }
        for (int i = 0; i < size; i++) {
            if (id.equalsIgnoreCase(heap[i].getId())) {
                return heap[i];
            }
        }
        return null;
    }

    public Prescription[] getAll() {
        Prescription[] snapshot = new Prescription[size];
        for (int i = 0; i < size; i++) {
            snapshot[i] = heap[i];
        }
        sortByPriorityDescending(snapshot);
        return snapshot;
    }

    private void sortByPriorityDescending(Prescription[] items) {
        for (int i = 1; i < items.length; i++) {
            Prescription key = items[i];
            int j = i - 1;
            while (j >= 0 && compare(items[j], key) < 0) {
                items[j + 1] = items[j];
                j--;
            }
            items[j + 1] = key;
        }
    }

    private int compare(Prescription a, Prescription b) {
        return a.getUrgency() - b.getUrgency();
    }

    private void siftUp(int index) {
        while (index > 0) {
            int parent = (index - 1) / 2;
            if (compare(heap[index], heap[parent]) <= 0) {
                break;
            }
            swap(index, parent);
            index = parent;
        }
    }

    private void siftDown(int index) {
        while (true) {
            int left = index * 2 + 1;
            int right = index * 2 + 2;
            int largest = index;
            if (left < size && compare(heap[left], heap[largest]) > 0) {
                largest = left;
            }
            if (right < size && compare(heap[right], heap[largest]) > 0) {
                largest = right;
            }
            if (largest == index) {
                break;
            }
            swap(index, largest);
            index = largest;
        }
    }

    private void swap(int i, int j) {
        Prescription temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
}
