import java.util.*;

public class PrintDivisors {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find its divisors:");
        int m = sc.nextInt();

        System.out.println("Divisors of " + m + " are:");
        printDivisors(m);

        sc.close();
    }

    public static void printDivisors(int m) {
        int n = Math.abs(m); // handle negative input

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
            }
        }
    }
}
