package com.dhpm11.Tuan_1.Lab_3;

import java.util.Scanner;

public class Lab3Bai4 {

    public static void main(String... argv) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chương trình nhập 2 mảng họ tên và điểm của sinh viên");
        System.out.print("Nhập số lượng sinh viên = ");
        byte n = Byte.parseByte(scanner.nextLine());
        if (n > 0) {
            String[] arrTen = new String[n];
            float[] arrDiem = new float[n];
            nhap(arrTen, arrDiem);

            System.out.println("-------------------------\nDanh sách sinh viên:\n-------------------------");
            xuat(arrTen, arrDiem);
            System.out.println("-------------------------");

            sapXep(arrTen, arrDiem);

            System.out.println("-------------------------\nDanh sách sinh viên đã sắp xếp theo điểm:\n-------------------------");
            xuat(arrTen, arrDiem);
            System.out.println("-------------------------");
        } else {
            System.out.println("Số lượng học sinh không được nhỏ hơn hoặc bằng 0.");
        }

        scanner.close();
    }

    private static void sapXep(String[] arrTen, float[] arrDiem) {
        for (int i = 0; i < arrDiem.length; i++) {
            for (int j = i + 1; j < arrDiem.length; j++) {
                if (arrDiem[i] > arrDiem[j]) {
                    float tempDiem = arrDiem[i];
                    arrDiem[i] = arrDiem[j];
                    arrDiem[j] = tempDiem;

                    String tempTen = arrTen[i];
                    arrTen[i] = arrTen[j];
                    arrTen[j] = tempTen;
                }
            }
        }
    }

    private static void xuat(String[] arrTen, float[] arrDiem) {
        for (int i = 0; i < arrTen.length; i++) {
            System.out.print("Tên: " + arrTen[i] + " - Điểm = " + arrDiem[i]);
            if (arrDiem[i] < 5) {
                System.out.println(" - Học lực: Yếu");
            } else if (arrDiem[i] < 6.5) {
                System.out.println(" - Học lực: Trung bình");
            } else if (arrDiem[i] < 7.5) {
                System.out.println(" - Học lực: Khá");
            } else if (arrDiem[i] < 9) {
                System.out.println(" - Học lực: Giỏi");
            } else {
                System.out.println(" - Học lực: Xuất sắc");
            }
        }
    }

    private static void nhap(String[] arrTen, float[] arrDiem) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrTen.length; i++) {
            System.out.print("Nhập họ tên sinh viên thứ " + (i + 1) + " : ");
            arrTen[i] = scanner.nextLine();
            System.out.print("Nhập điểm của sinh viên thứ " + (i + 1) + " : ");
            do {
                arrDiem[i] = Integer.parseInt(scanner.nextLine());
                if (arrDiem[i] < 0 || arrDiem[i] > 10) System.out.println("Điểm không phù hợp, vui lòng nhập lại!");
            } while (arrDiem[i] < 0 || arrDiem[i] > 10);
        }
    }

}
