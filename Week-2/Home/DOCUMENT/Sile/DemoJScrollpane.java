package com.dhpm11.Tuan_2.Home.DOCUMENT.Sile;

import javax.swing.*;
import java.awt.*;

public class DemoJScrollpane extends JFrame {
    public DemoJScrollpane(String title) {
        super(title);
    }

    public static void main(String[] args) {
        DemoJScrollpane ui = new DemoJScrollpane("Demo JScrollpane");
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
        ImageIcon img = new ImageIcon("com/dhpm11/Tuan_2/Home/DOCUMENT/Sile/baby.jpg");
        JLabel lblImg = new JLabel(img);
        JScrollPane scimg = new JScrollPane(lblImg, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        scimg.setPreferredSize(new Dimension(600,500));

        Container container = getContentPane();
        container.add(scimg);
    }
}
