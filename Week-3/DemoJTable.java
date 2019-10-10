/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dhpm11.tuan3;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Suong
 */
public class DemoJTable extends JFrame {

    public DemoJTable(String title) {
        super(title);
    }

    public static void main(String[] args) {
        DemoJTable ui = new DemoJTable("Demo JTable");
        ui.doShow();
    }

    private void doShow() {
        addControl();
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    private void addControl() {
        JPanel jpn = new JPanel();
        jpn.setLayout(new BorderLayout());
                                        
        DefaultTableModel dm = new DefaultTableModel();
        dm.addColumn("ID");
        dm.addColumn("Name");
        dm.addColumn("Age");

        final JTable tbl = new JTable(dm);
        dm.addRow(new String[]{"112", "Mr Lee", "21"});
        dm.addRow(new String[]{"113", "Mr Lee", "22"});

        JScrollPane sc = new JScrollPane(tbl);

        jpn.add(sc, BorderLayout.CENTER);
        add(jpn);
    }
}
