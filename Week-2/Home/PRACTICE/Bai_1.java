package com.dhpm11.Tuan_2.Home.PRACTICE;

import javax.swing.*;

public class Bai_1 extends JFrame {
    public Bai_1() {
        super("Demo Windows"); // Use to set title for this windows
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Allow click 'x' Top right corner to close the windows
    }

    public static void main(String[] args) {
        Bai_1 ui = new Bai_1();
        ui.setSize(400, 300); // set Width =400 and height =300
        ui.setLocationRelativeTo(null); // Display windows on desktop center screen
        ui.setVisible(true); // Show the windows
    }
}
