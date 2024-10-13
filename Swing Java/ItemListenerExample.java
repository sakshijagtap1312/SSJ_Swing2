import javax.swing.*;
import java.awt.event.*;

public class ItemListenerExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ItemListener Example");

        // Create a checkbox
        JCheckBox checkBox = new JCheckBox("Agree");
        checkBox.setBounds(50, 50, 100, 30);

        // Add an ItemListener to the checkbox
        checkBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    // Code to be executed when the checkbox is selected
                    JOptionPane.showMessageDialog(frame, "Checkbox Selected!");
                } else {
                    // Code to be executed when the checkbox is deselected
                    JOptionPane.showMessageDialog(frame, "Checkbox Deselected!");
                }
            }
        });

        frame.add(checkBox);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
