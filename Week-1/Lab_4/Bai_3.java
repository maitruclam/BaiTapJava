package com.dhpm11.Tuan_1.Lab_4;

public class Bai_3 {

    public static void main(String... args) {
        SanPham sp1 = new SanPham();
        SanPham sp2 = new SanPham();
        sp1.nhap();
        sp2.nhap();
        sp1 = new SanPham(sp1.getTenSp(), sp1.getDonGia(), sp1.getGiamGia());
        sp2 = new SanPham(sp2.getTenSp(), sp2.getDonGia());
        System.out.println("-----------------");
        System.out.println("Sản phẩm giảm giá: ");
        sp1.xuat();
        System.out.println("-----------------");
        System.out.println("Sản phẩm không giảm giá: ");
        sp2.xuat();
    }

}
