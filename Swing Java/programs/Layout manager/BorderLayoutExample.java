import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample {
    public static void main(String[] args) {
        // Create a new frame (window)
        JFrame frame = new JFrame("BorderLayout Example");
        
        // Set the size of the frame
        frame.setSize(400, 300);
        
        // Set the layout manager for the frame to BorderLayout
        frame.setLayout(new BorderLayout());
        
        // Create buttons for different regions
        JButton northButton = new JButton("North");
        JButton southButton = new JButton("South");
        JButton eastButton = new JButton("East");
        JButton westButton = new JButton("West");
        JButton centerButton = new JButton("Center");
        
        // Add buttons to the frame in different regions
        frame.add(northButton, BorderLayout.NORTH);
        frame.add(southButton, BorderLayout.SOUTH);
        frame.add(eastButton, BorderLayout.EAST);
        frame.add(westButton, BorderLayout.WEST);
        frame.add(centerButton, BorderLayout.CENTER);
        
        // Set the default close operation and make the frame visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
