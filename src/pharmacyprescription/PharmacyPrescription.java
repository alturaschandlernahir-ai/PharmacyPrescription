package pharmacyprescription;

/**
 * Application entry point. Launches the pharmacy prescription queue window.
 */
public class PharmacyPrescription {

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(() -> new PharmacyPrescriptionFrame().setVisible(true));
    }
}
