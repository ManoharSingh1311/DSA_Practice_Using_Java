import java.util.*;

public class SumOfNaturalNumbers {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N to find sum of first N natural numbers:");
        int n = sc.nextInt();

        int sum = sumNatural(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);

        sc.close();
    }

    public static int sumNatural(int n) {
        if (n <= 0) {
            return 0; // base case
        }
        return n + sumNatural(n - 1); // recursive step
    }
}
