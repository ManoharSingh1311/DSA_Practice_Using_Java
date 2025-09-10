import java.util.*;

public class PalindromeStringRecursive {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string to check palindrome:");
        String str = sc.nextLine();

        boolean isPalindrome = isPalindrome(str, 0, str.length() - 1);

        if (isPalindrome) {
            System.out.println("The string \"" + str + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + str + "\" is not a palindrome.");
        }

        sc.close();
    }

    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true; // base case: crossed pointers or single character
        }

        if (str.charAt(start) != str.charAt(end)) {
            return false; // mismatch found
        }

        // recursive check for next characters
        return isPalindrome(str, start + 1, end - 1);
    }
}
