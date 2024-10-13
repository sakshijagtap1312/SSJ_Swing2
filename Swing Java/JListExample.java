import javax.swing.*;

public class JListExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JList Example");
        
        String[] items = {"Item 1", "Item 2", "Item 3"};
        JList<String> list = new JList<>(items);
        list.setBounds(50, 50, 100, 60);
        
        frame.add(list);
        frame.setSize(300, 200);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
