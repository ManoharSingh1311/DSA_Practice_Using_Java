import java.util.*;

public class LeftRotateArrayDPlaces {

    // Brute Force: Extra array
    public static int[] leftRotateBrute(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        int[] temp = new int[n];
        int j = 0;
        for (int i = d; i < n; i++) temp[j++] = arr[i];
        for (int i = 0; i < d; i++) temp[j++] = arr[i];
        return temp;
    }

    // Optimal: Reversal algorithm (in-place)
    public static void leftRotateOptimal(int[] arr, int d) {
        int n = arr.length;
        d = d % n;
        reverse(arr, 0, d - 1);
        reverse(arr, d, n - 1);
        reverse(arr, 0, n - 1);
    }

    private static void reverse(int[] arr, int l, int r) {
        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        int d = sc.nextInt();

        // Brute Force
        int[] bruteArr = leftRotateBrute(arr, d);
        System.out.print("Brute Force Result: ");
        for (int x : bruteArr) System.out.print(x + " ");
        System.out.println();

        // Optimal
        int[] optArr = arr.clone();
        leftRotateOptimal(optArr, d);
        System.out.print("Optimal Result: ");
        for (int x : optArr) System.out.print(x + " ");
    }
}
