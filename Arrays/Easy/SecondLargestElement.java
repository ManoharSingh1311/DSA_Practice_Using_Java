import java.util.Scanner;

public class SecondLargestElement {

    // 🔹 Brute Force: Two passes
    public static int secondLargestBrute(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }

        int second = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max && arr[i] > second) second = arr[i];
        }
        return second;
    }

    // 🔹 Optimal: Single pass
    public static int secondLargestOptimal(int[] arr) {
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        return second;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println("Brute Force Second Largest: " + secondLargestBrute(arr));
        System.out.println("Optimal Second Largest: " + secondLargestOptimal(arr));
    }
}
