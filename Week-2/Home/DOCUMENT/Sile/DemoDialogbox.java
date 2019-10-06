package com.dhpm11.Tuan_2.Home.DOCUMENT.Sile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoDialogbox extends JFrame {
    public DemoDialogbox(String title) {
        super(title);
    }

    public static void main(String[] args) {
        DemoDialogbox ui = new DemoDialogbox("Demo Dialogbox");
        ui.doShow();
    }

    private void doShow() {
        addControl();
        setSize(400, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void addControl() {
        JPanel pnMain = new JPanel();
        JButton btnSayHi = new JButton("Say Hello!");
        pnMain.add(btnSayHi);
        JButton btnInput = new JButton("Input");
        pnMain.add(btnInput);
        JButton btnExit = new JButton("Thoát");
        pnMain.add(btnExit);

        Container container = getContentPane();
        container.add(pnMain);

        btnSayHi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello Tèo");
            }
        });

        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ret = JOptionPane.showConfirmDialog(null, "Muốn thoát hả?", "Thoát", JOptionPane.YES_NO_OPTION);
                if (ret == JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });

        btnInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = JOptionPane.showInputDialog("Nhập vào giá trị");
                if (s.length() > 0) {
                    btnInput.setText(s);
                } else {
                    JOptionPane.showMessageDialog(null, "Chưa nhập kìa");
                }
            }
        });
    }
}
