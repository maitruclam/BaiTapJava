package com.dhpm11.Tuan_2.Home.PRACTICE;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

public class Bai_5 extends JFrame {

    private JButton btnGiai, btnThoat, btnXoaTrang;
    private JTextField txtSoa, txtSob, txtSoc, txtKetqua;
    private JLabel lblTieuDe;

    public Bai_5() {
        super("Giải Phương Trình Bậc 2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel pnBorder = new JPanel();
        pnBorder.setLayout(new BorderLayout());

        JPanel pnNouth = new JPanel();
        lblTieuDe = new JLabel("Giải phương trình bậc 2");
        Font font = new Font("Arial", Font.BOLD, 20);
        lblTieuDe.setFont(font);
        lblTieuDe.setForeground(Color.BLACK);
        pnNouth.setBackground(Color.LIGHT_GRAY);
        pnNouth.add(lblTieuDe);
        pnBorder.add(pnNouth, BorderLayout.NORTH);

        JPanel pnCenter = new JPanel();
        pnCenter.setLayout(new BoxLayout(pnCenter, BoxLayout.Y_AXIS));
        Border border = BorderFactory.createLineBorder(Color.RED);
        TitledBorder titledBorder = new TitledBorder(border, "Nhập a, b, c");
        pnCenter.setBorder(titledBorder);
        // nhập a
        JPanel pna = new JPanel();
        JLabel lbla = new JLabel("a:");
        txtSoa = new JTextField(15);
        pna.add(lbla);
        pna.add(txtSoa);
        pnCenter.add(pna);
        // nhập b
        JPanel pnb = new JPanel();
        JLabel lblb = new JLabel("b:");
        txtSob = new JTextField(15);
        pnb.add(lblb);
        pnb.add(txtSob);
        pnCenter.add(pnb);
        // nhập c
        JPanel pnc = new JPanel();
        JLabel lblc = new JLabel("c:");
        txtSoc = new JTextField(15);
        pnc.add(lblc);
        pnc.add(txtSoc);
        pnCenter.add(pnc);
        // kết quả
        JPanel pnd = new JPanel();
        JPanel pnkq = new JPanel();
        pnkq.setLayout(new BoxLayout(pnkq, BoxLayout.Y_AXIS));
        JLabel lblkq = new JLabel("               Ket Qua");
        pnkq.add(lblkq);
        txtKetqua = new JTextField();
        txtKetqua.setEditable(false);
        pnkq.add(txtKetqua);
        txtKetqua.setPreferredSize(new Dimension(170, 20));
        pnd.add(pnkq);
        pnCenter.add(pnd);
        pnBorder.add(pnCenter, BorderLayout.CENTER);

        JPanel pnSouth = new JPanel();
        TitledBorder titledBorder3 = new TitledBorder(new BevelBorder(BevelBorder.LOWERED,Color.RED,Color.BLUE,Color.RED,Color.BLUE),"Chọn thao tác");
        pnSouth.setBorder(titledBorder3);
        // button
        btnGiai = new JButton("Giải");
        btnGiai.setEnabled(false);
        btnXoaTrang = new JButton("Xóa trắng");
        btnThoat = new JButton("Thoát");
        pnSouth.add(btnGiai);
        pnSouth.add(btnThoat);
        pnSouth.add(btnXoaTrang);
        pnBorder.add(pnSouth, BorderLayout.SOUTH);

        Container container = getContentPane();
        container.add(pnBorder);

        txtSoa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSob.requestFocus();
                txtSob.selectAll();
                testBtn();
            }
        });

        txtSob.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSoc.requestFocus();
                txtSoc.selectAll();
                testBtn();
            }
        });

        txtSoc.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btnGiai.requestFocus();
                testBtn();
            }
        });

        btnThoat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ret = JOptionPane.showConfirmDialog(null, "Muốn thoát à?", "Thoát", JOptionPane.YES_NO_OPTION);
                if (ret == JOptionPane.YES_OPTION)
                    System.exit(0);
            }
        });

        btnXoaTrang.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtSoa.setText("");
                txtSob.setText("");
                txtSoc.setText("");
                txtKetqua.setText("");
                txtSoa.requestFocus();
                btnGiai.setEnabled(false);
                txtKetqua.setEditable(false);
            }
        });

        btnGiai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = txtSoa.getText().trim();
                double a = 0, b = 0, c = 0;
                try {
                    a = Double.parseDouble(text);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Nhập sai định dạng!");
                    txtSoa.selectAll();
                    txtSoa.requestFocus();
                    txtKetqua.setEditable(false);
                    return;
                }
                text = txtSob.getText().trim();
                try {
                    b = Double.parseDouble(text);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Nhập sai định dạng!");
                    txtSob.selectAll();
                    txtSob.requestFocus();
                    txtKetqua.setEditable(false);
                    return;
                }
                text = txtSoc.getText().trim();
                try {
                    c = Double.parseDouble(text);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Nhập sai định dạng!");
                    txtSoc.selectAll();
                    txtSoc.requestFocus();
                    txtKetqua.setEditable(false);
                    return;
                }

                txtKetqua.setEditable(true);
                double delta = Math.pow(b, 2) - 4 * a * c;
                if (a == 0) {
                    if (b == 0) {
                        if (c == 0) {
                            txtKetqua.setText("Vô số nghiệm");
                        } else {
                            txtKetqua.setText("Vô nghiệm");
                        }
                    } else if (c == 0)
                        txtKetqua.setText("0");
                    else {
                        double x = -c / b;
                        txtKetqua.setText(x + "");
                    }
                } else {
                    if (delta > 0) {
                        txtKetqua.setText("x1 = " + ((-b + Math.sqrt(delta)) / (2 * a))
                                + "; x2 = " + ((-b - Math.sqrt(delta)) / (2 * a)));
                    } else if (delta == 0) {
                        txtKetqua.setText("x = " + ((-b / (2 * a))));
                    } else {
                        txtKetqua.setText("Phương trình vô nghiệm");
                    }
                }
            }
        });
    }

    private void testBtn() {
        txtKetqua.setEditable(false);
        if (!txtSoa.getText().trim().equals("")
                && !txtSob.getText().trim().equals("")
                && !txtSoc.getText().trim().equals("")) {
            btnGiai.setEnabled(true);
        } else {
            btnGiai.setEnabled(false);
        }
    }

    public static void main(String[] args) {
        Bai_5 ui = new Bai_5();
        ui.setVisible(true);
        ui.setLocationRelativeTo(null);
        ui.setSize(400, 300);
    }

}
