package com.dhpm11.Tuan_2.Home.DOCUMENT.Sile;

import javax.swing.*;
import java.awt.*;

public class DemoJComboBox extends JFrame {
    public DemoJComboBox(String title) {
        super(title);
    }

    public static void main(String[] args) {
        DemoJComboBox ui = new DemoJComboBox("Demo JComboBox");
        ui.doShow();
    }

    private void doShow() {
        addControl();
        setSize(400, 300);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void addControl() {
        JPanel pnBorder = new JPanel();
        pnBorder.setLayout(new BoxLayout(pnBorder, BoxLayout.X_AXIS));

        JPanel pnWest = new JPanel();
        pnWest.setLayout(new BoxLayout(pnWest, BoxLayout.Y_AXIS));
        JPanel pn1 = new JPanel();
        JComboBox cboWest1 = new JComboBox();
        cboWest1.addItem("Xuât sắc");
        cboWest1.addItem("Giỏi");
        cboWest1.addItem("Khá");
        cboWest1.addItem("Trung bình");
        cboWest1.setSelectedIndex(-1);
        pn1.add(cboWest1);
        pnWest.add(pn1);
        JPanel pn2 = new JPanel();
        String arr[] = {"Xuất sắc", "Giỏi", "Khá", "Trung bình"};
        JComboBox cboWest2 = new JComboBox(arr);
        pn2.add(cboWest2);
        pnWest.add(pn2);
        pnBorder.add(pnWest);

        JPanel pnEast = new JPanel();
        Person[] list = {
                new Person("1", "Trần Thành Công"),
                new Person("2", "Nguyễn Đại Thắng"),
                new Person("3", "Hoàng Thành Đạt")
        };
        JComboBox cboEast = new JComboBox(list);
        JPanel pn3 = new JPanel();
        pn3.add(cboEast);
        pnEast.add(pn3);
        pnBorder.add(pnEast);

        Person p = (Person) cboEast.getSelectedItem();
        System.out.println(p + "");

        Container container = getContentPane();
        container.add(pnBorder);
    }
}
