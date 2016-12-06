package laba6;

import java.awt.*;
import java.awt.event.*;

public class AwtForm extends Frame implements ActionListener {
    private TextArea textArea;

    public TextArea getTextArea() {
        return textArea;
    }

    public AwtForm() {
        setLayout(new FlowLayout());
        textArea = new TextArea();
        add(textArea);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}