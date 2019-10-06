package com.dhpm11.Tuan_2.Home.DOCUMENT.Sile;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoAdvancedControl extends JFrame {
    public DemoAdvancedControl(String title) {
        super(title);
    }

    public static void main(String[] args) {
        DemoAdvancedControl ui = new DemoAdvancedControl("Demo Advanced Control");
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
        JMenu file = new JMenu("File");
        menuBar.add(file);
        JMenu edit = new JMenu("Edit");
        menuBar.add(edit);
        JMenuItem mnuFileNew = new JMenuItem("New");
        file.add(mnuFileNew);
        JMenuItem mnuFileOpen = new JMenuItem("Open");
        file.add(mnuFileOpen);
        file.addSeparator();
        JMenuItem mnuFileExit = new JMenuItem("Exit");
        file.add(mnuFileExit);
        JMenuItem mnuEditSave = new JMenuItem("Save");
        JMenuItem mnuEditSaveAs = new JMenuItem("Save As");
        edit.add(mnuEditSave);
        edit.add(mnuEditSaveAs);
        mnuFileExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exit();
            }
        });
        mnuEditSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Comming Soon");
            }
        });
        mnuEditSaveAs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Comming Soon");
            }
        });
        mnuFileNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Comming Soon");
            }
        });
        mnuFileOpen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Comming Soon");
            }
        });
        setJMenuBar(menuBar);

        JToolBar toolBar = new JToolBar();
        JButton btnNew = new JButton("New");
        toolBar.add(btnNew);
        JCheckBox ckb = new JCheckBox("Checkme");
        toolBar.add(ckb);
        JButton btnExit = new JButton("Exit");
        toolBar.add(btnExit);
        add(toolBar, BorderLayout.NORTH);

        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                exit();
            }
        });

        btnNew.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Comming Soon");
            }
        });

        DefaultMutableTreeNode root = new DefaultMutableTreeNode("ĐH Gia Định");
        final JTree tree = new JTree(root);

        DefaultMutableTreeNode cnttNode = new DefaultMutableTreeNode("Công Nghệ TT");
        DefaultMutableTreeNode lopPMNode = new DefaultMutableTreeNode("Lớp 11DHPM");
        cnttNode.add(lopPMNode);
        DefaultMutableTreeNode lopMNode = new DefaultMutableTreeNode("Lớp 11DHMMT");
        cnttNode.add(lopMNode);
        root.add(cnttNode);

        DefaultMutableTreeNode ktNode = new DefaultMutableTreeNode("Kinh Tế");
        DefaultMutableTreeNode ktdnNode = new DefaultMutableTreeNode("Lớp Kinh Tế Đối Ngoại");
        ktNode.add(ktdnNode);
        DefaultMutableTreeNode qtkdNode = new DefaultMutableTreeNode("Lớp Quản trị Kinh Doanh");
        ktNode.add(qtkdNode);
        root.add(ktNode);

        DefaultMutableTreeNode veNode = new DefaultMutableTreeNode("Mỹ Thuật");
        root.add(veNode);

        JScrollPane sc = new JScrollPane(tree);
        getContentPane().add(sc);
    }

    private void exit() {
        int ret = JOptionPane.showConfirmDialog(null, "Thoát phải không?", "Exit", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
}
