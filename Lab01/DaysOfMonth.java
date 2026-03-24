package oop_lab.lab1;

import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Nhap thang: ");
            int month = sc.nextInt();
            System.out.print("Nhap nam: ");
            int year = sc.nextInt();
            if (month >= 1 && month <= 12 && year >= 0)
                break;
            System.out.println("Nam hoac thang khong hop le !");
        }

    }
}
