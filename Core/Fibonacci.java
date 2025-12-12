import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter how many terms");
        // int term = sc.nextInt();
        // int a = 0, b = 1;
        // System.out.print("Fibonacci Series: " + a + " " + b + " ");
        // for (int i = 3; i <= term; i++) {
        // int c = a + b;
        // System.out.print(c + " ");
        // a = b;
        // b = c;
        // }

        System.out.println("Enter a number");
        int num = sc.nextInt();
        int original_num = num;
        int rev = 0;

        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        if (original_num == rev) {
            System.out.println(original_num + " is a Palindrome Number.");
        } else {
            System.out.println(original_num + " is Not a Palindrome Number.");
        }

        sc.close();
    }
}
