package com.dhpm11.Tuan_2.Home.DOCUMENT.Sile;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Vector;

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
        setSize(400, 150);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void addControl() {
        DefaultTableModel dm = new DefaultTableModel();
        dm.addColumn("Mã");
        dm.addColumn("Tên");
        dm.addColumn("Tuổi");

        final JTable tbl = new JTable(dm);
        dm.addRow(new String[]{"112", "Ngô Văn Bắp", "21"});
        dm.addRow(new String[]{"113", "Nguyễn Thị Tý", "18"});
        dm.addRow(new String[]{"114", "Trần Văn Tèo", "22"});

        JScrollPane sc = new JScrollPane(tbl);

        Container container = getContentPane();
        container.setLayout(new BorderLayout());
        container.add(sc, BorderLayout.CENTER);

        tbl.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int row = tbl.getSelectedRow();
                int col = tbl.getSelectedColumn();
                String s = (String) tbl.getValueAt(row, col);
                JOptionPane.showMessageDialog(null, s);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        tbl.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                int row = tbl.getSelectedRow();
                int col = tbl.getSelectedColumn();
                String s = (String) tbl.getValueAt(row, col);
                JOptionPane.showMessageDialog(null, s);
            }
        });
//        dm.setRowCount(0);
        dm.getRowCount();
        dm.addRow(new String[]{"ID_002", "Võ Tòng", "32"});
        Vector<String> vec = new Vector<>();
        vec.add("ID_003");
        vec.add("Lâm Sung");
        vec.add("30");
        dm.addRow(vec);
    }
}
