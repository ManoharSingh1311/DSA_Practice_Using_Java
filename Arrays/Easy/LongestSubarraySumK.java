import java.util.Scanner;

public class LongestSubarraySumK {

    // Brute force method
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

    // Optimal method using sliding window (for positive integers)
    public static int longestSubarrayOptimal(int[] arr, int k) {
        int n = arr.length;
        int left = 0, right = 0, sum = 0, maxLen = 0;

        while (right < n) {
            sum += arr[right];

            // shrink window if sum > k
            while (sum > k && left <= right) {
                sum -= arr[left];
                left++;
            }

            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
        }
        return maxLen;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " positive integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter target sum K: ");
        int k = sc.nextInt();

        int brute = longestSubarrayBrute(arr, k);
        int optimal = longestSubarrayOptimal(arr, k);

        System.out.println("Longest Subarray Length (Brute Force): " + brute);
        System.out.println("Longest Subarray Length (Optimal): " + optimal);

        sc.close();
    }
}
