import javax.swing.*;

public class InputDialogExample {
    public static void main(String[] args) {
        // Displaying an input dialog
        String userInput = JOptionPane.showInputDialog(null, "Please enter your name:", "Input", JOptionPane.QUESTION_MESSAGE);

        // Check if the input is not null (user didn't cancel)
        if (userInput != null) {
            System.out.println("User entered: " + userInput);
        } else {
            System.out.println("User canceled the input dialog.");
        }
    }
}
