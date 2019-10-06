package com.dhpm11.Tuan_2.Class;

import javax.swing.*;
import java.awt.*;

public class DemoJframe extends JFrame {

    public DemoJframe(String title) {
        setTitle(title);
        setVisible(true);
        setSize(400, 400);
        setLocationRelativeTo(null); // đặt cửa sổ giữa màn hình
//        pack(); // kích thước vừa đủ content
        setResizable(true); // có thể được thay đổi hay ko, default = true
        getContentPane().setBackground(Color.BLUE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        DemoJframe objFrame = new DemoJframe("First Swing");
    }

}
