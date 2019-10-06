package com.dhpm11.Tuan_2.Home.PRACTICE;

import javax.swing.*;
import java.awt.*;

public class Bai_4 extends JFrame {
    public Bai_4() {
        super("BorderLayout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panelBorder = new JPanel();
        panelBorder.setLayout(new BorderLayout());
        Font font = new Font("Arial", Font.BOLD | Font.ITALIC, 25);

        JPanel panelNorth = new JPanel();
        panelNorth.setLayout(new BorderLayout());
        panelNorth.setBackground(Color.RED);
        panelNorth.setPreferredSize(new Dimension(0, 50));
        JLabel labelNorth = new JLabel("North", JLabel.CENTER);
        labelNorth.setForeground(Color.WHITE);
        labelNorth.setFont(font);
        panelNorth.add(labelNorth, BorderLayout.CENTER);
        panelBorder.add(panelNorth, BorderLayout.NORTH);

        JPanel panelSouth = new JPanel();
        panelSouth.setLayout(new BorderLayout());
        panelSouth.setBackground(Color.RED);
        panelSouth.setPreferredSize(panelNorth.getPreferredSize());
        JLabel labelSouth = new JLabel("South", JLabel.CENTER);
        labelSouth.setForeground(Color.WHITE);
        labelSouth.setFont(font);
        panelSouth.add(labelSouth, BorderLayout.CENTER);
        panelBorder.add(panelSouth, BorderLayout.SOUTH);

        JPanel panelWest = new JPanel();
        panelWest.setBackground(Color.BLUE);
        panelWest.setPreferredSize(new Dimension(70, 0));
        JLabel labelWest = new JLabel("West", JLabel.CENTER);
        labelWest.setFont(font);
        labelWest.setForeground(Color.WHITE);
        panelWest.setLayout(new BorderLayout());
        panelWest.add(labelWest, BorderLayout.CENTER);
        panelBorder.add(panelWest, BorderLayout.WEST);

        JPanel panelEast = new JPanel();
        panelEast.setBackground(Color.BLUE);
        panelEast.setPreferredSize(panelWest.getPreferredSize());
        JLabel labelEast = new JLabel("East", JLabel.CENTER);
        labelEast.setFont(font);
        labelEast.setForeground(Color.WHITE);
        panelEast.setLayout(new BorderLayout());
        panelEast.add(labelEast, BorderLayout.CENTER);
        panelBorder.add(panelEast, BorderLayout.EAST);

        JPanel panelCenter = new JPanel();
        panelCenter.setBackground(Color.YELLOW);
        panelCenter.setLayout(new BorderLayout());
        JLabel labelCenter = new JLabel("Center", JLabel.CENTER);
        labelCenter.setFont(font);
        labelCenter.setForeground(Color.BLACK);
        panelCenter.add(labelCenter, BorderLayout.CENTER);
        panelBorder.add(panelCenter, BorderLayout.CENTER);

        Container container = getContentPane();
        container.add(panelBorder);
    }

    public static void main(String[] args) {
        Bai_4 ui = new Bai_4();
        ui.setSize(400, 300);
        ui.setLocationRelativeTo(null);
        ui.setVisible(true);
    }
}