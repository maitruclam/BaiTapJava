package com.dhpm11.Tuan_2.Home.DOCUMENT.Sile;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class DemoJCheckBox extends JFrame {
    public DemoJCheckBox(String title) {
        super(title);
    }

    public static void main(String[] args) {
        DemoJCheckBox ui = new DemoJCheckBox("Demo JCheckBox");
        ui.doShow();
    }

    private void doShow() {
        addControl();
        pack();
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void addControl() {
        JPanel pnCheck = new JPanel();
        pnCheck.setLayout(new GridLayout(2, 2));
        Border border = BorderFactory.createEtchedBorder(Color.BLUE, Color.RED);
        pnCheck.setBorder(new TitledBorder(border, "Môn học yêu thích:"));

        JCheckBox chk1 = new JCheckBox("Java");
        JCheckBox chk2 = new JCheckBox("F Sharp");
        JCheckBox chk3 = new JCheckBox("C Sharp");
        JCheckBox chk4 = new JCheckBox("Ruby");

        pnCheck.add(chk1);
        pnCheck.add(chk2);
        pnCheck.add(chk3);
        pnCheck.add(chk4);

        Container container = getContentPane();
        container.add(pnCheck);

//        if (chk1.isSelected()) {
//            JOptionPane.showMessageDialog(null, "Bạn yêu thích môn " + chk1.getText() + " thiệt hông?");
//        } else if (chk2.isSelected()) {
//            JOptionPane.showMessageDialog(null, "Bạn yêu thích môn " + chk2.getText() + " thiệt hông?");
//        } else if (chk3.isSelected()) {
//            JOptionPane.showMessageDialog(null, "Bạn yêu thích môn " + chk3.getText() + " thiệt hông?");
//        } else if (chk4.isSelected()) {
//            JOptionPane.showMessageDialog(null, "Bạn yêu thích môn " + chk4.getText() + " thiệt hông?");
//        }
    }
}
