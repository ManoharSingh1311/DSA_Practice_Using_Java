import java.util.*;

public class CheckPalindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check palindrome:");
        int m = sc.nextInt();

        boolean isPalindrome = checkPalindrome(m);
        if (isPalindrome) {
            System.out.println("The number " + m + " is a palindrome.");
        } else {
            System.out.println("The number " + m + " is not a palindrome.");
        }

        sc.close();
    }

    public static boolean checkPalindrome(int m) {
        int original = m;
        int n = Math.abs(m); // handle negative numbers
        int rev = 0;

        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }

        // if original was negative, reversed version would also be negative
        if (m < 0) {
            rev = -rev;
        }

        return original == rev;
    }
}
