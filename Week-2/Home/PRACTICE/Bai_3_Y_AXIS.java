package com.dhpm11.Tuan_2.Home.PRACTICE;

import javax.swing.*;
import java.awt.*;

public class Bai_3_Y_AXIS extends JFrame {
    public Bai_3_Y_AXIS() {
        super("Học BoxLayout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JButton button1 = new JButton("BoxLayout");
        Font font = new Font("Arial", Font.BOLD | Font.ITALIC, 25);
        button1.setForeground(Color.RED);
        button1.setFont(font);
        panel.add(button1);

        JButton button2 = new JButton("X_AXIS");
        button2.setForeground(Color.BLUE);
        button2.setFont(font);
        panel.add(button2);

        JButton button3 = new JButton("Y_AXIS");
        button3.setForeground(Color.ORANGE);
        button3.setFont(font);
        panel.add(button3);

        Container container = getContentPane();
        container.add(panel);
    }

    public static void main(String[] args) {
        Bai_3_Y_AXIS ui = new Bai_3_Y_AXIS();
        ui.setSize(400, 300);
        ui.setVisible(true);
        ui.setLocationRelativeTo(null);
    }
}
