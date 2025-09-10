import java.util.*;

public class PrintNumbersRecursively {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N:");
        int n = sc.nextInt();

        System.out.println("Printing from 1 to " + n + ":");
        printOneToN(1, n);

        System.out.println("Printing from " + n + " to 1:");
        printNToOne(n);

        sc.close();
    }

    public static void printOneToN(int current, int n) {
        if (current > n) {
            return;
        }

        System.out.println(current);
        printOneToN(current + 1, n);
    }

    public static void printNToOne(int n) {
        if (n < 1) {
            return;
        }

        System.out.println(n);
        printNToOne(n - 1);
    }
}
