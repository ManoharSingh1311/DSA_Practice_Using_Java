import java.util.*;

public class CountDigits {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to count digits of that number:");
        int m = sc.nextInt();

        int ans = countDigit(m);
        System.out.println("Digits in number " + m + " are " + ans);
        sc.close();
    }

    public static int countDigit(int m) {
        int n = Math.abs(m); // handle negative numbers
        int ans = 0;

        if (n == 0) {
            ans = 1; // special case: 0 has 1 digit
        } else {
            while (n > 0) {
                n /= 10;
                ans++;
            }
        }
        return ans; 
    }
}
