package laba6;

import javax.swing.*;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class App {
    public static void main(String[] args) {
        try {
            InetAddress inetAddresses[] = InetAddress.getAllByName("google.com");
            String text = "";
            for (int i = 0; i < inetAddresses.length; i++) {
                text += inetAddresses[i].toString() + "\n\r";
                System.out.println(inetAddresses[i]);
            }

            showSwingGui(text);
            showAwtGui(text);

        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    private static void showAwtGui(String text) {
        AwtForm form2 = new AwtForm();
        form2.setVisible(true);
        form2.setSize(400, 400);
        form2.setTitle("AWT GUI for InetAddress");
        form2.getTextArea().setText(text);
        form2.getTextArea().setColumns(50);
        form2.getTextArea().setRows(50);
        form2.getTextArea().setEditable(false);
    }

    private static void showSwingGui(String text) {
        SwingForm form = new SwingForm();
        form.setVisible(true);
        form.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        form.setSize(400, 400);
        form.getTextArea1().setText(text);
    }
}
