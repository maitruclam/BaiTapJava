package com.dhpm11.Tuan_2.Home.PRACTICE;

import javax.swing.*;
import java.awt.*;

public class Bai_2 extends JFrame {
    public Bai_2() {
        super("Demo FlowLayout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.PINK);

        JButton button1 = new JButton("FlowLayout");
        JButton button2 = new JButton("Add các control");
        JButton button3 = new JButton("Trên 1 dòng");
        JButton button4 = new JButton("Hết chỗ chứa");
        JButton button5 = new JButton("Thì xuống dòng");

        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);

        Container container = getContentPane();
        container.add(panel);
    }

    public static void main(String[] args) {
        Bai_2 ui = new Bai_2();
        ui.setSize(400, 300);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
    }
}
