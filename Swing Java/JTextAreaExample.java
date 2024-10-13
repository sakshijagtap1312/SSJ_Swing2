import javax.swing.*;

public class JTextAreaExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JTextArea Example");
        JTextArea textArea = new JTextArea("Type here...");
        textArea.setBounds(50, 50, 200, 100);
        frame.add(textArea);

        frame.setSize(300, 250);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
