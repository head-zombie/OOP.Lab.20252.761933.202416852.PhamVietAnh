
import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 0;
        int year = 0;

        while (true) {
            System.out.print("Nhap thang (Ten, viet tat hoac so): ");
            String month = sc.nextLine().trim();

            System.out.print("Nhap nam: ");
            if (!sc.hasNextInt()) {
                System.out.println("Nam phai la so!");
                sc.nextLine();
                continue;
            }
            year = sc.nextInt();
            sc.nextLine();

            if (year < 0) {
                System.out.println("Nam phai la so duong!");
                continue;
            }

            if (month.equals("January") || month.equals("Jan.") || month.equals("Jan") || month.equals("1"))
                m = 1;
            else if (month.equals("February") || month.equals("Feb.") || month.equals("Feb") || month.equals("2"))
                m = 2;
            else if (month.equals("March") || month.equals("Mar.") || month.equals("Mar") || month.equals("3"))
                m = 3;
            else if (month.equals("April") || month.equals("Apr.") || month.equals("Apr") || month.equals("4"))
                m = 4;
            else if (month.equals("May") || month.equals("5"))
                m = 5;
            else if (month.equals("June") || month.equals("Jun.") || month.equals("Jun") || month.equals("6"))
                m = 6;
            else if (month.equals("July") || month.equals("Jul.") || month.equals("Jul") || month.equals("7"))
                m = 7;
            else if (month.equals("August") || month.equals("Aug.") || month.equals("Aug") || month.equals("8"))
                m = 8;
            else if (month.equals("September") || month.equals("Sep.") || month.equals("Sep") || month.equals("9"))
                m = 9;
            else if (month.equals("October") || month.equals("Oct.") || month.equals("Oct") || month.equals("10"))
                m = 10;
            else if (month.equals("November") || month.equals("Nov.") || month.equals("Nov") || month.equals("11"))
                m = 11;
            else if (month.equals("December") || month.equals("Dec.") || month.equals("Dec") || month.equals("12"))
                m = 12;
            else {
                System.out.println("Thang khong hop le, vui long nhap lai!");
                m = 0;
            }

            if (m != 0)
                break;
        }

        int days;
        if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12) {
            days = 31;
        } else if (m == 4 || m == 6 || m == 9 || m == 11) {
            days = 30;
        } else {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                days = 29;
            } else {
                days = 28;
            }
        }

        System.out.println("So ngay cua thang " + m + " nam " + year + " la: " + days);
        sc.close();
    }
}