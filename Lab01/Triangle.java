
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap n: ");
        int n = sc.nextInt();
        n = n * 2 - 1;
        sc.close();
        for (int i = 1; i <= n; i += 2) {
            int m = (n - i + 1) / 2;
            for (int j = 0; j < m; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
