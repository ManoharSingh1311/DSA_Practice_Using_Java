import java.util.*;

public class FibonacciRecursive {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of Fibonacci terms to print:");
        int n = sc.nextInt();

        System.out.println("Fibonacci sequence up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        sc.close();
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; // base case
        }
        if (n == 1) {
            return 1; // base case
        }
        return fibonacci(n - 1) + fibonacci(n - 2); // recursive step
    }
}
