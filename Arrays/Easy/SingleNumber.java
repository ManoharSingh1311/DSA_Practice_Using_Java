import java.util.Scanner;

public class SingleNumber {

    // Brute force method (O(n^2))
    public static int findSingleBrute(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count == 1) {
                return arr[i];
            }
        }
        return -1; // not found
    }

    // Optimal method using XOR (O(n))
    public static int findSingleOptimal(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num; // XOR cancels duplicates
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements (where every number appears twice except one):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int brute = findSingleBrute(arr);
        int optimal = findSingleOptimal(arr);

        System.out.println("Unique Number (Brute Force): " + brute);
        System.out.println("Unique Number (Optimal - XOR): " + optimal);

        sc.close();
    }
}
