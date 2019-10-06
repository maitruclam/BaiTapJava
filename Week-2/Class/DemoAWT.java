package com.dhpm11.Tuan_2.Class;

import java.awt.*;

public class DemoAWT extends Frame {
    public DemoAWT(String title) {
        super(title); // kế thừa hàm dựng từ lớp cha
        setVisible(true); // hiện
//        setSize(400, 400); // set kích thước màn hình

        this.setBounds(100, 150, 200, 200);
    }

    public static void main(String[] args) {
        new DemoAWT("First App");
    }
}
