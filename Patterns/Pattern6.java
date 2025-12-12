import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        int i, j, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter number of rows");
        n = sc.nextInt();

        for (i = 0; i < n / 2 + 2; i++) {
            for (j = 0; j < n + n / 2 - i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < n / (n - 1) + 2 * i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd part
        for (i = 0; i < n; i++) {
            for (j = 0; j < n / 2 + n / (n - 1); j++) {
                if (j >= n / 2 - i && j >= i - n / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            for (j = 0; j < n * 2 - 1; j++) {
                System.out.print(" ");
            }

            for (j = 0; j < n / 2 + n / (n - 1); j++) {
                if (j >= n / 2 - i && j >= i - n / 2) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

        for (i = 0; i < n / 2 + 2; i++) {
            for (j = 0; j < n - 1 + i; j++) {
                System.out.print(" ");
            }
            for (j = 0; j < n + 2 - (2 * i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }
}
