import javax.swing.*;
import java.awt.event.*;

public class ActionListenerExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ActionListener Example");

        // Create a button
        JButton button = new JButton("Click Me");
        button.setBounds(50, 50, 150, 30);

        // Add an ActionListener to the button
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Code to be executed when the button is clicked
                JOptionPane.showMessageDialog(frame, "Button Clicked!");
            }
        });

        frame.add(button);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
