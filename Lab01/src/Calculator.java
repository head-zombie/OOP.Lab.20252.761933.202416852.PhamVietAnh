package Lab01;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap lan luot 2 so nguyen: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Tong 2 so la: " + (a + b));
        System.out.println("Hieu 2 so la: " + (a - b));
        System.out.println("Tich 2 so la: " + (a * b));
        System.out.println("Thuong 2 so la: " + (a / b));
        sc.close();
    }
}
