package laba6;

import javax.swing.*;

public class SwingForm extends JFrame {
    private JPanel panel1;
    private JTextArea textArea1;
    private JButton button1;
    private JTextField textField1;

    public JTextArea getTextArea1() {
        return textArea1;
    }

    public SwingForm() {
        setContentPane(panel1);
        setSize(400, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}

