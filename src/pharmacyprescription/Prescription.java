package pharmacyprescription;
/**
 * Model class representing a single pharmacy prescription record.
 * Encapsulates patient details, medication name, and numeric urgency ranking.
 */
public class Prescription {
    private String prescriptionId;
    private String patientName;
    private String medication;
    private int urgencyLevel;
// Numeric urgency level mapping: 3 = High/Emergency, 2 = Medium, 1 = Low
    public Prescription(String prescriptionId, String patientName, String medication, int urgencyLevel) {
        this.prescriptionId = prescriptionId;
        this.patientName = patientName;
        this.medication = medication;
        this.urgencyLevel = urgencyLevel;
    }
/**
 * Accessor method for retrieving the unique prescription identifier.
 * @return Prescription ID string.
 */
    // This getter method resolves the red underline in PriorityQueue.java
    public String getPrescriptionId() {
        return prescriptionId;
    }
/**
 * Accessor method for retrieving the patient's full name.
 * @return Patient name string.
 */
    public String getPatientName() {
        return patientName;
    }

    public String getMedication() {
        /**
 * Accessor method for retrieving prescribed medication name.
 * @return Medication string.
 */
        return medication;
    }

    public int getUrgencyLevel() {
        return urgencyLevel;
    }

    Object getId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getName() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getUrgencyLabel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}