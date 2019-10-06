package com.dhpm11.Tuan_2.Home.DOCUMENT.Sile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoCardLayout extends JFrame {
    public DemoCardLayout(String title) {
        super(title);
        addControl();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void addControl() {
        JPanel pnBorder = new JPanel();
        pnBorder.setLayout(new BorderLayout());

        JPanel pnNouth = new JPanel();
        JButton btnShowCard1 = new JButton("Show Card 1");
        pnNouth.add(btnShowCard1);
        JButton btnShowCard2 = new JButton("Show Card 2");
        pnNouth.add(btnShowCard2);
        pnBorder.add(pnNouth, BorderLayout.NORTH);

        JPanel pnCenter = new JPanel(new CardLayout());
        pnCenter.setBackground(Color.LIGHT_GRAY);
        pnBorder.add(pnCenter, BorderLayout.CENTER);

        final JPanel pnCard1 = new JPanel();
        pnCard1.setBackground(Color.LIGHT_GRAY);
        pnCard1.add(new JButton("Hello"));
        pnCard1.add(new JButton("I'm Card 1"));
        pnCenter.add(pnCard1, "mycard1");

        final JPanel pnCard2 = new JPanel();
        pnCard2.setBackground(Color.PINK);
        pnCard2.add(new JButton("Hi"));
        pnCard2.add(new JCheckBox("CardLayout"));
        pnCard2.add(new JButton("I'm Card 2"));
        pnCenter.add(pnCard2, "mycard2");

        Container container = getContentPane();
        container.add(pnBorder);

        btnShowCard1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) pnCenter.getLayout();
                cl.show(pnCenter, "mycard1");
            }
        });

        btnShowCard2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardLayout cl = (CardLayout) pnCenter.getLayout();
                cl.show(pnCenter, "mycard2");
            }
        });
    }

    public static void main(String[] args) {
        DemoCardLayout ui = new DemoCardLayout("Demo CardLayout");
        ui.doShow();
    }

    private void doShow() {
        setVisible(true);
        setSize(400, 300);
        setLocationRelativeTo(null);
    }
}
