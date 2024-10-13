import javax.swing.*;

public class ConfirmationDialogExample {
    public static void main(String[] args) {
        // Displaying a confirmation dialog
        int response = JOptionPane.showConfirmDialog(null, "Do you want to proceed?", "Confirm", JOptionPane.YES_NO_OPTION);

        // Check the user's response
        if (response == JOptionPane.YES_OPTION) {
            System.out.println("User chose Yes.");
        } else if (response == JOptionPane.NO_OPTION) {
            System.out.println("User chose No.");
        } else {
            System.out.println("User closed the dialog or clicked Cancel.");
        }
    }
}
