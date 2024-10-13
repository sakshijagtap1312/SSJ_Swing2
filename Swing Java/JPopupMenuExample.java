import javax.swing.*;
import java.awt.event.*;

public class JPopupMenuExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JPopupMenu Example");
        
        JTextArea textArea = new JTextArea("Right-click to see the popup menu");
        textArea.setBounds(50, 50, 300, 100);
        
        JPopupMenu popupMenu = new JPopupMenu();
        JMenuItem cutItem = new JMenuItem("Cut");
        JMenuItem copyItem = new JMenuItem("Copy");
        popupMenu.add(cutItem);
        popupMenu.add(copyItem);
        
        textArea.setComponentPopupMenu(popupMenu);
        
        frame.add(textArea);
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
