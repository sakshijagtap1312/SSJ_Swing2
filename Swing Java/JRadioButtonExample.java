import javax.swing.*;

public class JRadioButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JRadioButton Example");
        
        JRadioButton option1 = new JRadioButton("Option 1");
        option1.setBounds(50, 50, 100, 30);
        
        JRadioButton option2 = new JRadioButton("Option 2");
        option2.setBounds(50, 80, 100, 30);
        
        ButtonGroup group = new ButtonGroup();
        group.add(option1);
        group.add(option2);

        frame.add(option1);
        frame.add(option2);
        
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
