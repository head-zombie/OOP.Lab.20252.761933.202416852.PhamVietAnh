package oop_lab.lab1;

import java.util.Scanner;

public class DaysOfMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Nhap thang: ");
            String month = sc.nextInt();
            System.out.print("Nhap nam: ");
            int year = sc.nextInt();
            if (month.equals("January") && month.equals("Jan") && month.equals("Jan.") && month.equals("1"))
                break;
            if (month.equals("February") && month.equals("Feb") && month.equals("Feb.") && month.equals("2"))
                break;
            if (month.equals("March") && month.equals("Mar") && month.equals("Mar.") && month.equals("3"))
                break;
            if (month.equals("April") && month.equals("Apr") && month.equals("Jan.") && month.equals("4"))
                break;
            if (month.equals("January") && month.equals("Jan") && month.equals("Jan.") && month.equals("5"))
                break;
            if (month.equals("January") && month.equals("Jan") && month.equals("Jan.") && month.equals("6"))
                break;
            if (month.equals("January") && month.equals("Jan") && month.equals("Jan.") && month.equals("7"))
                break;
            if (month.equals("January") && month.equals("Jan") && month.equals("Jan.") && month.equals("8"))
                break;
            if (month.equals("January") && month.equals("Jan") && month.equals("Jan.") && month.equals("9"))
                break;
            if (month.equals("January") && month.equals("Jan") && month.equals("Jan.") && month.equals("10"))
                break;
            if (month.equals("January") && month.equals("Jan") && month.equals("Jan.") && month.equals("11"))
                break;
            if (month.equals("January") && month.equals("Jan") && month.equals("Jan.") && month.equals("12"))
                break;
        }

    }
}
