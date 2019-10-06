package com.dhpm11.Tuan_2.Class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoCardLayout extends JFrame {

    public DemoCardLayout() {
        setVisible(true);
        setSize(400, 400);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.MAGENTA);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        final JPanel pnCenter = new JPanel();
        pnCenter.setLayout(new CardLayout());
        final JPanel pnCard1 = new JPanel();
        pnCard1.setBackground(Color.LIGHT_GRAY);
        final JPanel pnCard2 = new JPanel();
        pnCard2.setBackground(Color.PINK);
        pnCenter.add(pnCard1, "mycard1");
        pnCenter.add(pnCard2, "mycard2");
        final JButton btnShowCard1 = new JButton("Button");
        btnShowCard1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cardLayout = (CardLayout) pnCenter.getLayout();
                cardLayout.show(pnCenter, "mycard1");
            }
        });
        pnCenter.add(btnShowCard1);
        Container container = getContentPane();
        container.add(pnCard1);
        container.add(pnCard2);
        container.add(btnShowCard1);
    }

    public static void main(String[] args) {
        new DemoCardLayout();
    }

}
