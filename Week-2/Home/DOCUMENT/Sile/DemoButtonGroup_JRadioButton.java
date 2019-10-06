package com.dhpm11.Tuan_2.Home.DOCUMENT.Sile;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class DemoButtonGroup_JRadioButton extends JFrame {
    public DemoButtonGroup_JRadioButton(String title) {
        super(title);
    }

    public static void main(String[] args) {
        DemoButtonGroup_JRadioButton ui = new DemoButtonGroup_JRadioButton("Demo ButtonGroup & JRadioButton");
        ui.doShow();
    }

    private void doShow() {
        addControl();
        setSize(150, 170);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void addControl() {
        JPanel pnGroup = new JPanel();
        pnGroup.setLayout(new BoxLayout(pnGroup, BoxLayout.Y_AXIS));
        pnGroup.setBorder(new TitledBorder(BorderFactory.createLineBorder(Color.RED), "Chọn nè:"));

        JRadioButton rad1 = new JRadioButton("Rất hài lòng");
        JRadioButton rad2 = new JRadioButton("Hài lòng");
        JRadioButton rad3 = new JRadioButton("Tạm chấp nhận");
        JRadioButton rad4 = new JRadioButton("Không chấp nhận");

        ButtonGroup group = new ButtonGroup();
        group.add(rad1);
        group.add(rad2);
        group.add(rad3);
        group.add(rad4);

        pnGroup.add(rad1);
        pnGroup.add(rad2);
        pnGroup.add(rad3);
        pnGroup.add(rad4);

        Container container = getContentPane();
        container.add(pnGroup);
    }
}
