import java.util.*;
/*Manohar Singh*/
public class CheckArmstrong {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if it's an Armstrong number:");
        int m = sc.nextInt();

        boolean isArmstrong = checkArmstrong(m);
        if (isArmstrong) {
            System.out.println("The number " + m + " is an Armstrong number.");
        } else {
            System.out.println("The number " + m + " is not an Armstrong number.");
        }

        sc.close();
    }

    public static boolean checkArmstrong(int m) {
        int n = Math.abs(m); // ignore negative sign
        int original = n;
        int digits = countDigits(n);
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, digits);
            n /= 10;
        }

        return sum == original;
    }

    public static int countDigits(int n) {
        int count = 0;
        do {
            count++;
            n /= 10;
        } while (n > 0);
        return count;
    }
}

