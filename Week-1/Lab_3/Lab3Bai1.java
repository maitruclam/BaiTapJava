package com.dhpm11.Tuan_1.Lab_3;

import java.util.Scanner;

public class Lab3Bai1 {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chương trinh kiểm tra số nguyên tố");
        System.out.print("Nhập vào 1 số nguyên N = ");
        int n = scanner.nextInt();
        boolean ok = true;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                ok = false;
                break;
            }
        }
        if (ok && n > 1) System.out.print(n + " là số nguyên tố");
        else System.out.print(n + " không phải là số nguyên tố");
    }

}
