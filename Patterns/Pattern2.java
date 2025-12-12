import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        int i, j, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter number of rows");
        n = sc.nextInt();
        for (i = 0; i < n; i++) {
            for (j = 0; j < n / 2; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < n + 2; j++) {
                if (j == 0 || j == n + 1 || i == 0 || i == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (i = 0; i < n; i++) {
            for (j = 0; j < n / 2; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < n + 2; j++) {
                if (j == 0 || j == n + 1) {
                    System.out.print("e");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        for (i = 0; i < n / 2 + 1; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < n - i * 2; j++) {
                System.out.print("*");
            }
            for (j = 0; j < n / (n - 1) + 2 * i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < n - 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
