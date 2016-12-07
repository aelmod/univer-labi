package laba6;

import java.awt.*;
import java.awt.event.*;

public class AwtForm extends Frame {
    private TextArea textArea = new TextArea();
    private TextField textField = new TextField();
    private Button btnShowAddrs = new Button();

    public AwtForm() {
        setLayout(new FlowLayout());
        setSize(400, 400);
        setTitle("AWT GUI for InetAddress");
        addWindowListener(new WindowClose());

        add(textField);
        textField.setColumns(30);

        add(btnShowAddrs);
        btnShowAddrs.addActionListener(this::onButtonClick);
        btnShowAddrs.setLabel("Show Addresses");

        add(textArea);
        textArea.setColumns(50);
        textArea.setRows(50);
        textArea.setEditable(false);
    }

    private void onButtonClick(ActionEvent event) {
        String inetAddresses = InetAddressResolver.getInetAddrsByDomainName(textField.getText());
        textArea.setText(textArea.getText() + inetAddresses + "\n\r");
    }

    private class WindowClose extends WindowAdapter {
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }

}