package com.dhpm11.Tuan_1.Lab_4;

import java.util.ArrayList;
import java.util.Scanner;

public class Bai_5 {

    public static void main(String... argv) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng sản phẩm: ");
        int n = Integer.parseInt(scanner.nextLine());
        ArrayList<SanPham> sanPhamArrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            SanPham sp = new SanPham();
            System.out.println("----------------------------------");
            System.out.println("Nhập thông tin sản phẩm thứ " + (i + 1) + " :");
            sp.nhap();
            sanPhamArrayList.add(sp);
        }

        System.out.println("--------------------------");
        System.out.println("Danh sách sản phẩm :");
        for (int i = 0; i < n; i++) {
            System.out.println("Thông tin sản phẩm thứ " + (i + 1) + " :");
            sanPhamArrayList.get(i).xuat();
            System.out.println("--------------------------");
        }

        scanner.close();
    }

}
