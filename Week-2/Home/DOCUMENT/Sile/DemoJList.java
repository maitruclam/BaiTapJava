package com.dhpm11.Tuan_2.Home.DOCUMENT.Sile;

import javax.swing.*;
import java.awt.*;

public class DemoJList extends JFrame {
    public DemoJList(String title) {
        super(title);
    }

    public static void main(String[] args) {
        DemoJList ui = new DemoJList("Demo JList");
        ui.doShow();
    }

    private void doShow() {
        addControl();
        setSize(400, 300);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    private void addControl() {
        JPanel pnBorder = new JPanel();
        Person[] list = {
                new Person("1", "Đỗ Công Thành"),
                new Person("2", "Nguyễn Văn Hùng"),
                new Person("3", "Trần Duy Thanh"),
                new Person("4", "Đoàn Ái Nương"),
                new Person("5", "Đào Cẩm Hằng"),
                new Person("6", "Đỗ Công Thành ... "),
                new Person("7", "Đỗ Công Thành"),
                new Person("8", "Đỗ Công Thành"),
                new Person("9", "Đỗ Công Thành"),
                new Person("10", "Đỗ Công Thành"),
                new Person("11", "Đỗ Công Thành fdsgf sdfsd fds f "),
                new Person("12", "Đỗ Công Thành"),
        };

        JList jl = new JList(list);
        jl.setSelectionBackground(Color.RED);
        jl.setSelectionForeground(Color.WHITE);
        JScrollPane scjl = new JScrollPane(jl, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        pnBorder.add(scjl);

        Container container = getContentPane();
        container.add(pnBorder);
    }
}
