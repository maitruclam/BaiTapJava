package com.dhpm11.Tuan_2.Home.DOCUMENT.Sile;

import javax.swing.*;
import java.awt.*;

public class DemoCardLayoutTab extends JFrame {
    public DemoCardLayoutTab(String title) {
        super(title);
    }

    private void addControl() {

        JTabbedPane myTabbed = new JTabbedPane();
        JPanel pnTab1 = new JPanel();
        pnTab1.setBackground(Color.BLUE);
        pnTab1.add(new JButton("Tabbed 1"));
        myTabbed.add(pnTab1, "Tab 1");

        JPanel pnTab2 = new JPanel();
        pnTab2.setBackground(Color.ORANGE);
        pnTab2.add(new JButton("Tabbed 2"));
        myTabbed.add(pnTab2, "Tab 2");

        Container container = getContentPane();
        container.add(myTabbed);
    }

    public static void main(String[] args) {
        DemoCardLayoutTab ui = new DemoCardLayoutTab("My Tabbled");
        ui.doShow();
    }

    private void doShow() {
        setSize(400, 300);
        setLocationRelativeTo(null);
        addControl();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
