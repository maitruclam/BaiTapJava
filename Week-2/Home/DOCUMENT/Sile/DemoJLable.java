package com.dhpm11.Tuan_2.Home.DOCUMENT.Sile;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class DemoJLable extends JFrame {
    public DemoJLable(String title) {
        super(title);
    }

    public static void main(String[] args) {
        DemoJLable ui = new DemoJLable("Demo JLable");
        ui.doShow();
    }

    private void doShow() {
        addControl();
        setSize(100, 100);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void addControl() {
        JPanel panel = new JPanel();
        JLabel label = new JLabel("Đồng hồ nè:");
        label.setForeground(Color.RED);
        ImageIcon icon = new ImageIcon("com/dhpm11/Tuan_2/Home/DOCUMENT/Sile/watch.png");
        label.setIcon(icon);
        panel.add(label);

        Container container = getContentPane();
        container.add(panel);
    }
}
