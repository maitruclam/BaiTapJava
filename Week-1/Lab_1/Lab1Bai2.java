package com.dhpm11.Tuan_1.Lab_1;

import java.util.Scanner;

public class Lab1Bai2 {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tính chu vi, diện tích hình chữ nhật!");
        System.out.print("Nhập vào chiều dài: ");
        double dai = scanner.nextDouble();
        System.out.print("Nhập vào chiều rộng: ");
        double rong = scanner.nextDouble();
        double chiVi = (dai + rong) * 2;
        double dienTich = dai * rong;
        double min = Math.min(dai, rong);

        System.out.println("Chu vi = " + chiVi);
        System.out.printf("Diện tích = %.2f\n", dienTich);
        System.out.println("Cạnh nhỏ nhất = " + min);
        scanner.close();
    }

}
