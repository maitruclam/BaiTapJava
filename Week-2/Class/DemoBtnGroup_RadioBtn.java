package com.dhpm11.Tuan_2.Class;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class DemoBtnGroup_RadioBtn extends JFrame {

    public DemoBtnGroup_RadioBtn() {
        setTitle("Button Group & Radio Button");
        setSize(500, 500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel pnGroup = new JPanel();
        pnGroup.setLayout(new BoxLayout(pnGroup, BoxLayout.Y_AXIS)); // sắp xép đối tượng theo hàng dọc, còn X_AXIS thì theo hàng ngang

        Color color = null;
        Border border = BorderFactory.createLineBorder(color.RED);
        TitledBorder titledBorder = new TitledBorder(border, "Chọn nè:");
        pnGroup.setBorder(titledBorder);

        JRadioButton radioButton1 = new JRadioButton("Rất hài lòng");
        JRadioButton radioButton2 = new JRadioButton("Hài lòng");
        JRadioButton radioButton3 = new JRadioButton("Tạm chấp nhận");
        JRadioButton radioButton4 = new JRadioButton("Không chấp nhận");

        ButtonGroup group = new ButtonGroup();
        group.add(radioButton1);
        group.add(radioButton2);
        group.add(radioButton3);
        group.add(radioButton4);

        pnGroup.add(radioButton1);
        pnGroup.add(radioButton2);
        pnGroup.add(radioButton3);
        pnGroup.add(radioButton4);
        add(pnGroup); // đưa vào JFrame
        setVisible(true);
    }

    public static void main(String[] args) {
        new DemoBtnGroup_RadioBtn();
    }

}
