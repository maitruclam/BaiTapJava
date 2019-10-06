package com.dhpm11.Tuan_2.Home.DOCUMENT.Sile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoJButton extends JFrame {
    public DemoJButton(String title) {
        super(title);
    }

    public static void main(String[] args) {
        DemoJButton ui = new DemoJButton("Demo JButton");
        ui.doShow();
    }

    private void doShow() {
        addControl();
        setResizable(false);
        setLocationRelativeTo(null);
        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void addControl() {
        JPanel panel = new JPanel();
        JButton btn = new JButton("Watch");
        btn.setIcon(new ImageIcon("com/dhpm11/tuan2/Home/DOCUMENT/Sile/watch.png"));
        btn.setMnemonic('W');
        panel.add(btn);

        Container container = getContentPane();
        container.add(panel);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Bây giờ là mấy giờ nhỉ?");
            }
        });
    }
}
