package com.dhpm11.Tuan_2.Home.DOCUMENT.Sile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DemoEventListener extends JFrame {
    public DemoEventListener(String title) {
        super(title);
    }

    public static void main(String[] args) {
        DemoEventListener ui = new DemoEventListener("Demo EventListener");
        ui.doShow();
    }

    private void doShow() {
        addControl();
        setSize(400, 100);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void addControl() {
        JPanel pnBorder = new JPanel();
        JPanel pn1 = new JPanel();
        JButton btnSayhi = new JButton("Say Hello!");
        pn1.add(btnSayhi);
        pnBorder.add(pn1);

        Container container = getContentPane();
        container.add(pnBorder);

        btnSayhi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello tèo");
            }
        });

        btnSayhi.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
//                JOptionPane.showMessageDialog(null,"mouseClicked");
            }

            @Override
            public void mousePressed(MouseEvent e) {
//                JOptionPane.showMessageDialog(null,"mousePressed");
            }

            @Override
            public void mouseReleased(MouseEvent e) {
//                JOptionPane.showMessageDialog(null,"mouseReleased");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
//                JOptionPane.showMessageDialog(null,"mouseEntered");
            }

            @Override
            public void mouseExited(MouseEvent e) {
//                JOptionPane.showMessageDialog(null,"mouseExited");
            }
        });
    }
}
