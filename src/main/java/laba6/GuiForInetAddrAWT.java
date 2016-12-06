package laba6;

import java.awt.*;
import java.awt.event.*;

public class GuiForInetAddrAWT extends Frame implements ActionListener {
    private TextArea textArea;

    public TextArea getTextArea() {
        return textArea;
    }

    public GuiForInetAddrAWT() {
        setLayout(new FlowLayout());
        textArea = new TextArea();
        add(textArea);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
}