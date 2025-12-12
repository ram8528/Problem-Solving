import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        int i, j, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter number of rows");
        n = sc.nextInt();

        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n / (n - 1) + i; j++) {
                System.out.print("*");
            }
            for (j = 0; j < (3 * n) - (2 * (i + 1)); j++) {
                System.out.print(" ");
            }
            for (j = 0; j < n / (n - 1) + i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = 0; i < n / (n - 1); i++) {
            for (j = 0; j < n * 2 + n; j++) {
                if (j < n || j >= (2 * n)) {
                    System.out.print("*");
                } else {
                    System.out.print("@");
                }
            }
            System.out.println();
        }

        // 3rd step
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (i = 0; i < n / 2 + 1; i++) {
            for (j = 0; j < n + i; j++) {
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
