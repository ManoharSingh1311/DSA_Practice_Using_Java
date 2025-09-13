import java.util.Scanner;

public class MoveZerosToOneEnd {

    // 🔹 Brute Force: Extra array
    public static void moveZerosBrute(int[] arr) {
        int[] temp = new int[arr.length];
        int j = 0;
        for (int num : arr) {
            if (num != 0) temp[j++] = num;
        }
        for (int i = 0; i < arr.length; i++) arr[i] = temp[i];
    }

    // 🔹 Optimal: In-place (two-pointer approach)
    public static void moveZerosOptimal(int[] arr) {
        int j = 0; // index for placing non-zero
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                // swap arr[i] with arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        // 🔹 Brute Force
        int[] bruteArr = arr.clone();
        moveZerosBrute(bruteArr);
        System.out.print("Brute Force Result: ");
        for (int x : bruteArr) System.out.print(x + " ");
        System.out.println();

        // 🔹 Optimal
        int[] optArr = arr.clone();
        moveZerosOptimal(optArr);
        System.out.print("Optimal Result: ");
        for (int x : optArr) System.out.print(x + " ");
    }
}
