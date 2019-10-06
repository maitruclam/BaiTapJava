package com.dhpm11.Tuan_1.Lab_2;

import java.util.Scanner;

public class Lab2Bai4 {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("+--------------------------------------+");
        System.out.println("1. Giải phương trình bậc nhất");
        System.out.println("2. Giải phương trình bậc 2");
        System.out.println("3. Tính tiền điện");
        System.out.println("4. Kết thúc");
        System.out.println("+--------------------------------------+");
        System.out.print("Chọn chức năng: ");

        byte option = scanner.nextByte();
        switch (option) {
            case 1:
                System.out.print("Nhập a = ");
                float a = scanner.nextFloat();
                System.out.print("Nhập b = ");
                float b = scanner.nextFloat();
                Lab2Bai4.giaiPTB1(a, b);
                break;
            case 2:
                System.out.print("Nhập a = ");
                float x = scanner.nextFloat();
                System.out.print("Nhập b = ");
                float y = scanner.nextFloat();
                System.out.print("Nhập c = ");
                float z = scanner.nextFloat();
                Lab2Bai4.giaiPTB2(x, y, z);
                break;
            case 3:
                long soKyDien;
                do {
                    System.out.print("Nhập vào số ký điện của tháng = ");
                    soKyDien = scanner.nextLong();
                    if (soKyDien <= 0)
                        System.out.println("Số ký điện không được nhỏ hơn hoặc bằng 0");
                } while (soKyDien <= 0);
                long tien = Lab2Bai4.tinhTienDien(soKyDien);
                System.out.print("Tiền điện phải trả là : " + tien);
                break;
            case 4:
                break;
        }

        scanner.close();
    }

    public static void giaiPTB1(float a, float b) {
        if (a == 0) {
            if (b == 0) {
                System.out.print("Vô số nghiệm");
            } else {
                System.out.print("Vô nghiệm");
            }
        } else if (b == 0) System.out.println("x = 0");
        else {
            double x = -b / a;
            System.out.printf("Có 1 nghiệm x = %.2f", x);
        }
    }

    public static void giaiPTB2(float a, float b, float c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        if (a == 0) {
            giaiPTB1(b, c);
        } else {
            if (delta > 0) {
                System.out.println("Phương trình có 2 nghiệm kép");
                System.out.printf("x1 = %.2f \n", (-b + Math.sqrt(delta)) / (2 * a));
                System.out.printf("x2 = %.2f", (-b - Math.sqrt(delta)) / (2 * a));
            } else if (delta == 0) {
                System.out.println("Phương trình có nghiệm kép");
                System.out.printf("x = %.2f", (-b / (2 * a)));
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }

    public static long tinhTienDien(long soKyDien) {
        long tien = 0;
        if (soKyDien < 50) {
            tien = soKyDien * 1000;
        } else {
            tien = 50 * 1000 + (soKyDien - 50) * 1200;
        }

        return tien;
    }
}
