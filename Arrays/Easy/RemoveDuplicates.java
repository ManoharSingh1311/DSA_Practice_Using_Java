import java.util.*;

public class RemoveDuplicates {

    // 🔹 Brute Force: Extra space, assumes array is sorted
    public static int[] removeDuplicatesBrute(int[] arr) {
        int n = arr.length;
        if (n == 0) return new int[0];

        int[] temp = new int[n];
        int j = 0;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1]; // last element

        int[] result = new int[j];
        for (int i = 0; i < j; i++) result[i] = temp[i];
        return result;
    }

    // 🔹 Optimal: In-place, O(1) extra space (Two-pointer technique, sorted input required)
    public static int[] removeDuplicatesOptimal(int[] arr) {
        int n = arr.length;
        if (n == 0) return new int[0];

        int j = 0;  // index of unique elements
        for (int i = 1; i < n; i++) {
            if (arr[i] != arr[j]) {
                arr[++j] = arr[i];
            }
        }

        return Arrays.copyOfRange(arr, 0, j + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int[] ansBrute = removeDuplicatesBrute(arr);
        System.out.print("Brute Force Result: ");
        for (int x : ansBrute) System.out.print(x + " ");
        System.out.println();

        int[] ansOptimal = removeDuplicatesOptimal(arr);
        System.out.print("Optimal Result: ");
        for (int x : ansOptimal) System.out.print(x + " ");
    }
}
