import java.util.Scanner;

public class AddTwoMatrices {
    public static void main(String[] args) {
        int MAX = 100;
        int[][] m1 = new int[MAX][MAX];
        int[][] m2 = new int[MAX][MAX];
        int[][] m = new int[MAX][MAX];
        for (int i = 0; i < MAX; i++) {
            for (int j = 0; j < MAX; j++) {
                m1[i][j] = 0;
                m2[i][j] = 0;
            }
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap kich thuoc 2 ma tran: ");
        int n = sc.nextInt();
        System.out.println("Nhap ma tran thu 1");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap hang " + (i + 1) + " cua ma tran: ");
            for (int j = 0; j < n; j++)
                m1[i][j] = sc.nextInt();
        }
        System.out.println("Nhap ma tran thu 2");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap hang " + (i + 1) + " cua ma tran: ");
            for (int j = 0; j < n; j++)
                m2[i][j] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = m1[i][j] + m2[i][j];
            }
        }
        System.out.println("m = m1 + m2");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(m[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
