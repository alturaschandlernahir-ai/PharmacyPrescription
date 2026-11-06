package pharmacyprescription;

/**
 * A single pharmacy prescription waiting in the priority queue.
 */
public class Prescription {

    private final String id;
    private final String name;
    private final String medication;
    private final int urgency;

    public Prescription(String id, String name, String medication, int urgency) {
        this.id = id;
        this.name = name;
        this.medication = medication;
        this.urgency = urgency;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMedication() {
        return medication;
    }

    public int getUrgency() {
        return urgency;
    }

    public String getUrgencyLabel() {
        switch (urgency) {
            case 3:
                return "3 - High/Emergency";
            case 2:
                return "2 - Medium";
            default:
                return "1 - Low";
        }
    }

    @Override
    public String toString() {
        return "Prescription ID: " + id
                + "\nPatient Name: " + name
                + "\nMedication: " + medication
                + "\nUrgency: " + getUrgencyLabel();
    }
}
