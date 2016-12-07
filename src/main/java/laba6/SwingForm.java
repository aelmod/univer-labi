package laba6;

import javax.swing.*;
import java.awt.event.ActionEvent;

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

        button1.addActionListener(this::onButtonClick);
    }

    private void onButtonClick(ActionEvent event) {
        String inetAddresses = InetAddressResolver.getInetAddrsByDomainName(textField1.getText());
        textArea1.setText(textArea1.getText() + inetAddresses + "\n\r");
    }
}

