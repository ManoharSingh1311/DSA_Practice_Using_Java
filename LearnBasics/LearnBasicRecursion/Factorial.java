import java.util.*;

public class Factorial {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to find factorial:");
        int n = sc.nextInt();

        long fact = factorial(n);
        System.out.println("Factorial of " + n + " is: " + fact);

        sc.close();
    }

    public static long factorial(int n) {
        if (n < 0) {
            return -1; // factorial not defined for negative numbers
        }
        if (n == 0 || n == 1) {
            return 1; // base case
        }
        return n * factorial(n - 1); // recursive step
    }
}
