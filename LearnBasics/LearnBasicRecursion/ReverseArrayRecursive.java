import java.util.*;

public class ReverseArrayRecursive {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements of the array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        reverseArray(arr, 0, n - 1); // recursive call

        System.out.println("Reversed array is:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }

    public static void reverseArray(int[] arr, int start, int end) {
        if (start >= end) {
            return; // base case
        }

        // swap elements
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        // recursive call
        reverseArray(arr, start + 1, end - 1);
    }
}
