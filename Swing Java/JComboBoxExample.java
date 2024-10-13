import javax.swing.*;

public class JComboBoxExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JComboBox Example");
        
        String[] items = {"Option A", "Option B", "Option C"};
        JComboBox<String> comboBox = new JComboBox<>(items);
        comboBox.setBounds(50, 50, 150, 30);
        
        frame.add(comboBox);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
