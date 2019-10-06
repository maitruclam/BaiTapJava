package com.dhpm11.Tuan_2.Class;

import javax.swing.*;
import java.awt.*;

public class DemoFlowLayout extends JFrame {

    public DemoFlowLayout(String title) {
        setTitle(title);
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
//        pack();
        setResizable(true);

        JPanel pnFlow = new JPanel(new FlowLayout());
//        pnFlow.setLayout(new FlowLayout());
        pnFlow.setBackground(Color.PINK);
        // thành phần
        JButton btn1 = new JButton("FlowLayout");
        JButton btn2 = new JButton("Add các control");
        JButton btn3 = new JButton("Trên 1 dòng");
        JButton btn4 = new JButton("Hết chỗ chứa");
        JButton btn5 = new JButton("Thì xuống dòng");
        pnFlow.add(btn1);
        pnFlow.add(btn2);
        pnFlow.add(btn3);
        pnFlow.add(btn4);
        pnFlow.add(btn5);
        Container container = getContentPane();
        container.add(pnFlow);
    }

    public static void main(String[] args) {
        DemoFlowLayout demoFlowLayout = new DemoFlowLayout("Flow Layout");
    }

}
