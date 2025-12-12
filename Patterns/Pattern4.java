import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        int i, j, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter number of rows");
        n = sc.nextInt();

        for (i = 0; i < (n / 2) + 1; i++) {
            for (j = 0; j < (n + n / 2) - i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd part
        for (i = 0; i < n / 2 + 1; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < n; j++) {
                if (j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // 3rd [part]
        for (i = 0; i < n / 2 + 1; i++) {
            for (j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < n - 2 * i; j++) {
                System.out.print("e");
            }
            for (j = 0; j < n + 2 * i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < n - 2 * i; j++) {
                System.out.print("e");
            }
            System.out.println();
        }
        sc.close();
    }
}
