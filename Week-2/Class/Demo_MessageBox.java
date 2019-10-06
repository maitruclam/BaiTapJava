package com.dhpm11.Tuan_2.Class;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Demo_MessageBox extends JFrame {

    public Demo_MessageBox() {
        setTitle("Test Message Box");
        setSize(500, 500);
        setLocationRelativeTo(null);
//        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton btn1 = new JButton("Say Hello!");
        Container container = getContentPane();
        container.add(btn1);
        setContentPane(container);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Hello tèo");
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new Demo_MessageBox();
    }

}
