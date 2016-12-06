package laba6;

import javax.swing.*;

public class SwingForm extends JFrame {
    private JPanel panel1;
    private JTextArea textArea1;

    public JTextArea getTextArea1() {
        return textArea1;
    }

    public SwingForm() {
        setContentPane(panel1);
    }
}

