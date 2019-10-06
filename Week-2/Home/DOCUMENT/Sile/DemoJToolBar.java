package com.dhpm11.Tuan_2.Home.DOCUMENT.Sile;

import javax.swing.*;
import java.awt.*;

public class DemoJToolBar extends JFrame {
    public DemoJToolBar(String title) {
        super(title);
    }

    public static void main(String[] args) {
        DemoJToolBar ui = new DemoJToolBar("Demo JToolBar");
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
        JToolBar toolBar = new JToolBar("MyBar");
        JButton btn1 = new JButton("New");
        toolBar.add(btn1);
        JCheckBox chk1 = new JCheckBox("CheckBox");
        toolBar.add(chk1);
        JButton btn2 = new JButton("Exit");
        toolBar.add(btn2);

        add(toolBar, BorderLayout.NORTH);
    }
}
