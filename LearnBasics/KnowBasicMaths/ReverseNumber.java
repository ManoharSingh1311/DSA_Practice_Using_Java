import java.util.*;

public class ReverseNumber {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to reverse:");
        int m = sc.nextInt();

        int ans = reverseNumber(m);
        System.out.println("Reverse of number " + m + " is " + ans);
        sc.close();
    }

    public static int reverseNumber(int m) {
        int n = Math.abs(m); // handle negative numbers
        int rev = 0;

        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }

        // if original was negative, make result negative
        if (m < 0) {
            rev = -rev;
        }

        return rev;
    }
}
