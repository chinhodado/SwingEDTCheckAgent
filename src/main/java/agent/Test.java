package agent;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello!");
        JPanel panel = new JPanel();

        //Test getter
        panel.isDoubleBuffered();

        //Test another method
        panel.revalidate();
    }
}
