package OtherProjects.src.soict.hedspi.Lab01;

import java.util.Scanner;

public class Equation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Giai phuong trinh bac nhat");
            System.out.println("2. Giai he 2 phuong trinh bac nhat");
            System.out.println("3. Giai phuong trinh bac hai");
            System.out.println("4. Thoat");
            System.out.print("=> Ban muon chon: ");

            int luachon = sc.nextInt();

            if (luachon == 4) {
                System.out.println("Thoat chuong trinh.");
                break;
            } else if (luachon == 1) {
                System.out.print("Nhap a: ");
                double a = sc.nextDouble();
                System.out.print("Nhap b: ");
                double b = sc.nextDouble();
                if (a == 0) {
                    System.out.println(b == 0 ? "Vo so nghiem (Infinite solutions)" : "Vo nghiem (No solution)");
                } else {
                    System.out.printf("Nghiem x = %.3f\n", -b / a);
                }

            } else if (luachon == 2) {
                System.out.print("Nhap a11, a12, b1: ");
                double a11 = sc.nextDouble();
                double a12 = sc.nextDouble();
                double b1 = sc.nextDouble();
                System.out.print("Nhap a21, a22, b2: ");
                double a21 = sc.nextDouble();
                double a22 = sc.nextDouble();
                double b2 = sc.nextDouble();

                double D = a11 * a22 - a21 * a12;
                double D1 = b1 * a22 - b2 * a12;
                double D2 = a11 * b2 - a21 * b1;

                if (D != 0) {
                    System.out.printf("He co nghiem duy nhat: x = %.2f, y = %.2f\n", D1 / D, D2 / D);
                } else {
                    if (D1 == 0 && D2 == 0)
                        System.out.println("He vo so nghiem.");
                    else
                        System.out.println("He vo nghiem.");
                }

            } else if (luachon == 3) {
                System.out.print("Nhap a, b, c: ");
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                double c = sc.nextDouble();

                if (a == 0) {
                    if (b == 0)
                        System.out.println(c == 0 ? "Vo so nghiem" : "Vo nghiem");
                    else
                        System.out.printf("Nghiem: %.3f\n", -c / b);
                } else {
                    double delta = b * b - 4 * a * c;
                    if (delta < 0) {
                        System.out.println("Vo nghiem (No real roots)");
                    } else if (delta == 0) {
                        System.out.printf("Nghiem kep: x = %.3f\n", -b / (2 * a));
                    } else {
                        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                        System.out.printf("Co 2 nghiem: x1 = %.3f, x2 = %.3f\n", x1, x2);
                    }
                }
            } else {
                System.out.println("Lua chon khong hop le!");
            }
        }
        sc.close();
    }
}