package laba6;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("1) Swing GUI");
        System.out.println("1) AWT GUI");
        System.out.println("1) Console");
        System.out.println("4) Exit");
        switch (ConsoleUtils.getIntFromUser(1,4)) {
            case 1: showSwingGui(); break;
            case 2: showAwtGui(); break;
            case 3: showConsoleMenu(); break;
            case 4: System.exit(0);
        }
    }

    private static void showConsoleMenu() {
        while (true) {
            System.out.println("Input domain name:");
            String domainName = ConsoleUtils.getWordFromUser();
            String inetAddresses = InetAddressResolver.getInetAddrsByDomainName(domainName);
            System.out.println(inetAddresses);
            System.out.println("Press any key to continue...");
            ConsoleUtils.waitForEnterKeyPress();
            ConsoleUtils.clearScreen();
        }
    }

    private static void showAwtGui() {
        AwtForm awtForm = new AwtForm();
        awtForm.setVisible(true);
    }

    private static void showSwingGui() {
        SwingForm swingForm = new SwingForm();
        swingForm.setVisible(true);
    }
}