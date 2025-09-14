import java.util.*;

public class MaxConsecutiveOnes {

    // Brute Force: O(n^2)
    public static int maxConsecutiveOnesBrute(int[] arr) {
        int n = arr.length;
        int maxCount = 0;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i; j < n; j++) {
                if (arr[j] == 1) {
                    count++;
                    maxCount = Math.max(maxCount, count);
                } else {
                    break;
                }
            }
        }
        return maxCount;
    }

    // Optimal: O(n)
    public static int maxConsecutiveOnesOptimal(int[] arr) {
        int maxCount = 0, count = 0;
        for (int num : arr) {
            if (num == 1) {
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println("Brute Force Result: " + maxConsecutiveOnesBrute(arr));
        System.out.println("Optimal Result: " + maxConsecutiveOnesOptimal(arr));
    }
}
