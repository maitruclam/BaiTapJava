package com.dhpm11.Tuan_1.Lab_4;

public class Bai_2 {

    public static void main(String[] argv) {

        SanPham sp1 = new SanPham();
        SanPham sp2 = new SanPham();

        sp1.nhap();
        sp2.nhap();

        System.out.println("--------------------");
        sp1.xuat();
        System.out.println("--------------------");
        sp2.xuat();
        System.out.println("--------------------");
    }

}
