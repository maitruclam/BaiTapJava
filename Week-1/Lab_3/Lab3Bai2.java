package com.dhpm11.Tuan_1.Lab_3;

import java.util.Scanner;

public class Lab3Bai2 {

    public static void main(String... args) {
        System.out.println("+--------------------------+");
        System.out.println("1. Bảng cửu chương cần tìm.");
        System.out.println("2. Bảng cửu chương.");
        System.out.println("3. Kết thúc.");
        System.out.println("+--------------------------+");
        System.out.print("Lựa chọn: ");
        Scanner scanner = new Scanner(System.in);
        byte n = scanner.nextByte();
        switch (n) {
            case 1:
                System.out.println("Nhập vào 1 số: ");
                int x = scanner.nextInt();
                System.out.println("Bảng cửu chương cần tìm là: ");
                bangCuuChuongCanTim(x);
                break;
            case 2:
                System.out.println("Bảng cửu chương:\n--------------");
                bangCuuChuong();
                break;
            default:
                break;
        }
        scanner.close();
    }

    public static void bangCuuChuongCanTim(int numBer) {
        for (int i = 1; i <= 10; i++) System.out.printf("%d x %d = %d \n", numBer, i, numBer * i);
        System.out.println("-----------");
    }

    public static void bangCuuChuong() {
        for (int i = 2; i <= 9; i++) {
            bangCuuChuongCanTim(i);
        }
    }

}
