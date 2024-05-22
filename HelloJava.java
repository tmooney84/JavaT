import javax.swing.*;

public class HelloJava {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tester Java File!");
        frame.setSize(300, 150);
        JLabel label = new JLabel("This is a tester for upload", JLabel.CENTER);
        frame.add(label);
        frame.setVisible(true);
    }
}
