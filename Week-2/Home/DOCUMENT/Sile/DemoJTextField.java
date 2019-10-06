package com.dhpm11.Tuan_2.Home.DOCUMENT.Sile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DemoJTextField extends JFrame {
    public DemoJTextField(String title) {
        super(title);
    }

    public static void main(String[] args) {
        DemoJTextField ui = new DemoJTextField("Demo JTextField");
        ui.doShow();
    }

    private void doShow() {
        addControl();
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void addControl() {
        JPanel panel = new JPanel();
        JLabel lblNhapTen = new JLabel("Nhập tên:");
        panel.add(lblNhapTen);
        JTextField txtTen = new JTextField(15);
//        txtTen.setEditable(false);
        txtTen.setText("Hello Tèo");
        panel.add(txtTen);

        Container container = getContentPane();
        container.add(panel);

        txtTen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = txtTen.getText();
                try {
//                    int n = Integer.parseInt(s);
//                    double d = Double.parseDouble(s);
//                    float f = Float.parseFloat(s);
                    JOptionPane.showMessageDialog(null, s);
                    txtTen.selectAll();
                    txtTen.requestFocus();
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "lỗi kìa");
                    txtTen.selectAll();
                    txtTen.requestFocus();
                }


            }
        });
    }
}
