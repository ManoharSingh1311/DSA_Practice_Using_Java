import java.util.*;

public class PrintNTimes {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many times to print the message:");
        int n = sc.nextInt();

        printMessage(n);

        sc.close();
    }

    public static void printMessage(int n) {
        if (n <= 0) {
            return; // base case
        }

        System.out.println("This is recursion!");
        printMessage(n - 1); // recursive call
    }
}
