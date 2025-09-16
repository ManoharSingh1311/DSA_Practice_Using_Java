import java.util.*;

public class LongestSubarraySumKWithNegatives {

    // Brute force method (O(n^2))
    public static int longestSubarrayBrute(int[] arr, int k) {
        int n = arr.length;
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }
        return maxLen;
    }

    // Optimal method (O(n)) using HashMap
    public static int longestSubarrayOptimal(int[] arr, int k) {
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        int prefixSum = 0, maxLen = 0;

        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];

            // Case 1: whole subarray from 0 to i has sum K
            if (prefixSum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }

            // Case 2: check if prefixSum - k was seen before
            if (map.containsKey(prefixSum - k)) {
                maxLen = Math.max(maxLen, i - map.get(prefixSum - k));
            }

            // Store prefixSum if not seen before (to keep longest length)
            if (!map.containsKey(prefixSum)) {
                map.put(prefixSum, i);
            }
        }

        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers (can be positive or negative):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum K: ");
        int k = sc.nextInt();

        int brute = longestSubarrayBrute(arr, k);
        int optimal = longestSubarrayOptimal(arr, k);

        System.out.println("Longest Subarray Length (Brute Force): " + brute);
        System.out.println("Longest Subarray Length (Optimal - HashMap): " + optimal);

        sc.close();
    }
}
