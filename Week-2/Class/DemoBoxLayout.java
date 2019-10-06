package com.dhpm11.Tuan_2.Class;

import javax.swing.*;
import java.awt.*;

public class DemoBoxLayout extends JFrame {

    public DemoBoxLayout(String title) {
        setTitle(title);
        setSize(400, 400);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.MAGENTA);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel pnBox = new JPanel();
        pnBox.setLayout(new BoxLayout(pnBox, BoxLayout.X_AXIS));
        JButton btn1 = new JButton("BoxLayout");
        btn1.setBackground(Color.RED);
        Font font = new Font("Arial", Font.BOLD / Font.ITALIC, 25);
        btn1.setFont(font);
        pnBox.add(btn1);
        JButton btn2 = new JButton("X_AXIS");
        btn2.setForeground(Color.BLUE);
        btn2.setFont(font);
        pnBox.add(btn2);
        JButton btn3 = new JButton("Y_AXIS");
        btn3.setFont(font);
        btn3.setForeground(Color.ORANGE);
        pnBox.add(btn3);

        Container container = getContentPane();
        container.setSize(100, 100);
        container.add(pnBox);

//        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        DemoBoxLayout demoBoxLayout = new DemoBoxLayout("BoxLayout");
    }

}
