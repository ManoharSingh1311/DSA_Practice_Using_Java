import java.util.*;

public class GCD_HCF {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        
        System.out.println("Enter the second number:");
        int b = sc.nextInt();

        int result = findGCD(a, b);
        System.out.println("GCD (HCF) of " + a + " and " + b + " is " + result);
        sc.close();
    }

    public static int findGCD(int a, int b) {
        a = Math.abs(a); // handle negative inputs
        b = Math.abs(b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
