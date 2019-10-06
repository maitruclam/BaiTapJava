package com.dhpm11.Tuan_2.Home.DOCUMENT.Sile;

import javax.swing.*;
import java.awt.*;

public class DemoJTextArea extends JFrame {
    public DemoJTextArea(String title) {
        super(title);
    }

    public static void main(String[] args) {
        DemoJTextArea ui = new DemoJTextArea("Demo JTextArea");
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
        JPanel panel = new JPanel();
        JLabel lblMota = new JLabel("Mô tả:");
        panel.add(lblMota);
        JTextArea are = new JTextArea(5, 15);
        JScrollPane sc = new JScrollPane(are);
        panel.add(sc);

        Container container = getContentPane();
        container.add(panel);
    }
}
