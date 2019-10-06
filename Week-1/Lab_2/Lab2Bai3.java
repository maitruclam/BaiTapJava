package com.dhpm11.Tuan_1.Lab_2;

import java.util.Scanner;

public class Lab2Bai3 {

    public static void main(String... args) {
        long soKyDien, tien = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chương trình tính tiền điện");

        do {
            System.out.print("Nhập vào số ký điện của tháng = ");
            soKyDien = scanner.nextLong();
            if (soKyDien <= 0)
                System.out.println("Số ký điện không được nhỏ hơn hoặc bằng 0");
        } while (soKyDien <= 0);

        if (soKyDien < 50) {
            tien = soKyDien * 1000;
        } else {
            tien = 50 * 1000 + (soKyDien - 50) * 1200;
        }
        System.out.println("Tiền điện phải trả là: " + tien);
        scanner.close();
    }

}
