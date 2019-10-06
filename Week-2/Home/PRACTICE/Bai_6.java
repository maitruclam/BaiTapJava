package com.dhpm11.Tuan_2.Home.PRACTICE;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bai_6 extends JFrame {
    public Bai_6(String title) {
        super(title);
    }

    public void doShow() {
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        addControl();
        setResizable(false);
        setVisible(true);
    }

    private void addControl() {
        JPanel panelBorder = new JPanel();
        Font font = new Font("Arial", Font.BOLD, 25);
        panelBorder.setLayout(new BorderLayout());
        JPanel panelNorth = new JPanel(new BorderLayout());
        JLabel labelTitle = new JLabel("Cộng Trừ Nhân Chia", JLabel.CENTER);
        labelTitle.setForeground(Color.BLUE);
        labelTitle.setFont(font);
        panelNorth.add(labelTitle, BorderLayout.CENTER);
        panelBorder.add(panelNorth, BorderLayout.NORTH);

        JPanel panelWest = new JPanel();
        panelWest.setLayout(new BoxLayout(panelWest, BoxLayout.Y_AXIS));
        panelWest.setPreferredSize(new Dimension(85, 0));
        panelWest.setBackground(Color.LIGHT_GRAY);
        JButton btnGiai = new JButton("Giải    ");
        JButton btnXoa = new JButton("Xóa    ");
        JButton btnThoat = new JButton("Thoát ");
        panelWest.add(btnGiai);
        panelWest.add(Box.createVerticalStrut(10));
        panelWest.add(btnXoa);
        panelWest.add(Box.createVerticalStrut(10));
        panelWest.add(btnThoat);
        Border borderWest = BorderFactory.createLineBorder(Color.RED);
        TitledBorder titledBorderWest = new TitledBorder(borderWest, "Chọn tác vụ");
        panelWest.setBorder(titledBorderWest);
        panelBorder.add(panelWest, BorderLayout.WEST);

        JPanel panelSouth = new JPanel();
        panelSouth.setPreferredSize(new Dimension(0, 30));
        panelSouth.setBackground(Color.PINK);
        JPanel pbs1 = new JPanel();
        JPanel pbs2 = new JPanel();
        JPanel pbs3 = new JPanel();
        pbs1.setBackground(Color.BLUE);
        pbs2.setBackground(Color.RED);
        pbs3.setBackground(Color.YELLOW);
        panelSouth.add(pbs1);
        panelSouth.add(pbs2);
        panelSouth.add(pbs3);
        panelBorder.add(panelSouth, BorderLayout.SOUTH);

        JPanel panelCenter = new JPanel();
        panelCenter.setLayout(new BoxLayout(panelCenter, BoxLayout.Y_AXIS));
        Border borderCenter = BorderFactory.createLineBorder(Color.RED);
        TitledBorder titledBorderCenter = new TitledBorder(borderCenter, "Nhập 2 số a và b:");
        panelCenter.setBorder(titledBorderCenter);

        JPanel pna = new JPanel();
        JLabel lbla = new JLabel("Nhập a:");
        JTextField txta = new JTextField(15);
        pna.add(lbla);
        pna.add(txta);
        panelCenter.add(pna);

        JPanel pnb = new JPanel();
        JLabel lblb = new JLabel("Nhập b:");
        JTextField txtb = new JTextField(15);
        pnb.add(lblb);
        pnb.add(txtb);
        panelCenter.add(pnb);

        JPanel pnc = new JPanel();
        JPanel pnpheptoan = new JPanel();
        pnpheptoan.setLayout(new GridLayout(2, 2));
        pnpheptoan.setBorder(new TitledBorder(BorderFactory.createLineBorder(Color.BLACK), "Chọn phép toán:"));
        JRadioButton radCong = new JRadioButton("Cộng");
        radCong.setSelected(true);
        JRadioButton radTru = new JRadioButton("Trừ");
        JRadioButton radNhan = new JRadioButton("Nhân");
        JRadioButton radChia = new JRadioButton("Chia");
        pnpheptoan.add(radCong);
        pnpheptoan.add(radTru);
        pnpheptoan.add(radNhan);
        pnpheptoan.add(radChia);
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radCong);
        buttonGroup.add(radTru);
        buttonGroup.add(radNhan);
        buttonGroup.add(radChia);
        pnc.add(pnpheptoan);
        panelCenter.add(pnc);

        JPanel pnkq = new JPanel();
        JLabel lblkq = new JLabel("Kết quả:");
        JTextField txtkq = new JTextField(15);
        pnkq.add(lblkq);
        pnkq.add(txtkq);
        panelCenter.add(pnkq);
        panelBorder.add(panelCenter, BorderLayout.CENTER);
        lbla.setPreferredSize(lblkq.getPreferredSize());
        lblb.setPreferredSize(lblkq.getPreferredSize());

        Container container = getContentPane();
        container.add(panelBorder);

        btnThoat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ret = JOptionPane.showConfirmDialog(null, "Muốn thoát hả?", "Thoát", JOptionPane.YES_NO_OPTION);
                if (ret == JOptionPane.YES_NO_OPTION)
                    System.exit(0);
            }
        });

        btnXoa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txta.setText("");
                txtb.setText("");
                txtkq.setText("");
                txta.requestFocus();
            }
        });

        btnGiai.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = txta.getText().trim();
                double a = 0, b = 0;
                try {
                    a = Double.parseDouble(text);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Nhập sai định dạng!");
                    txta.selectAll();
                    txta.requestFocus();
                    return;
                }
                text = txtb.getText().trim();
                try {
                    b = Double.parseDouble(text);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Nhập sai định dạng!");
                    txtb.selectAll();
                    txtb.requestFocus();
                    return;
                }

                double kq = 0;
                if (radCong.isSelected())
                    kq = (a + b);
                else if (radTru.isSelected())
                    kq = (a - b);
                else if (radNhan.isSelected())
                    kq = (a * b);
                else if (radChia.isSelected()) {
                    if (b != 0)
                        kq = (a * 1.0 / b * 1.0);
                    else {
                        JOptionPane.showMessageDialog(null, "b phải khác 0 !");
                        txtb.selectAll();
                        txtb.requestFocus();
                    }
                }
                txtkq.setText(kq + "");
            }
        });
    }

    public static void main(String[] args) {
        Bai_6 ui = new Bai_6("Cộng - Trừ - Nhân - Chia");
        ui.doShow();
    }
}
