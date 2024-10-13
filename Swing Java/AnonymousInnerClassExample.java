import javax.swing.*;
import java.awt.event.*;

public class AnonymousInnerClassExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Anonymous Inner Class Example");
        
        JButton button = new JButton("Click Me");
        button.setBounds(50, 50, 150, 30);

        // Anonymous inner class implementing ActionListener
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
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
