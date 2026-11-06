package pharmacyprescription;

/**
 * Custom array-based Priority Queue implementation for managing Prescriptions.
 * Stores elements sorted by urgency level without using java.util collections.
 */
public class PriorityQueue {
    private Prescription[] elements;
    private int size;

    public PriorityQueue(int capacity) {
        this.elements = new Prescription[capacity];
        this.size = 0;
    }

 /**
 * Inserts a prescription sorted by urgency level in descending order.
 * Higher urgency levels (e.g., 3 - Emergency) remain toward the front.
 */
    public boolean enqueue(Prescription prescription) {
        if (size >= elements.length) {
            return false; // Queue is full
        }

        int i = size - 1;
        // Shift elements with lower urgency to the right
        while (i >= 0 && elements[i].getUrgencyLevel() < prescription.getUrgencyLevel()) {
            elements[i + 1] = elements[i];
            i--;
        }

        elements[i + 1] = prescription;
        size++;
        return true;
    }

    /**
     * Dequeues and returns the highest priority prescription (index 0).
     * Shifts remaining elements to the left.
     */
    public Prescription dequeue() {
        if (size == 0) {
            return null; // Queue is empty
        }

        Prescription highest = elements[0];
        for (int i = 0; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }

        elements[size - 1] = null;
        size--;
        return highest;
    }

    /**
     * Performs a manual linear search by Prescription ID.
     */
    public Prescription searchById(String id) {
        for (int i = 0; i < size; i++) {
            if (elements[i].getPrescriptionId().equalsIgnoreCase(id)) {
                return elements[i];
            }
        }
        return null;
    }

    /**
     * Returns an array snapshot of all active prescriptions in the queue.
     */
    public Prescription[] getAll() {
        Prescription[] current = new Prescription[size];
        for (int i = 0; i < size; i++) {
            current[i] = elements[i];
        }
        return current;
    }

    public int getSize() {
        return size;
    }
}