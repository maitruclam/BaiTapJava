package com.dhpm11.Tuan_2.Home.DOCUMENT.Sile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoJMenuBar extends JFrame {
    public DemoJMenuBar(String title) {
        super(title);
    }

    public static void main(String[] args) {
        DemoJMenuBar ui = new DemoJMenuBar("Demo JMenuBar");
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
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);
        JMenu mnuFile = new JMenu("File");
        JMenu mnuEdit = new JMenu("Edit");
        menuBar.add(mnuFile);
        menuBar.add(mnuEdit);
        JMenuItem mnuFileNew = new JMenuItem("New");
        JMenuItem mnuFileOpen = new JMenuItem("Open");
        JMenuItem mnuFileExit = new JMenuItem("Exit");
        mnuFile.add(mnuFileNew);
        mnuFile.add(mnuFileOpen);
        mnuFile.addSeparator();
        mnuFile.add(mnuFileExit);

        mnuFileExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
