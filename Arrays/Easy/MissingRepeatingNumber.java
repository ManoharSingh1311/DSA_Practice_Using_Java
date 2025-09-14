import java.util.*;

public class MissingRepeatingNumber {

    // Brute Force: Using frequency array
    public static int[] findBrute(int[] arr) {
        int n = arr.length;
        int[] freq = new int[n + 1];
        int repeating = -1, missing = -1;

        for (int num : arr) freq[num]++;

        for (int i = 1; i <= n; i++) {
            if (freq[i] == 0) missing = i;
            else if (freq[i] > 1) repeating = i;
        }
        return new int[]{repeating, missing};
    }

    // Optimal: Using math (sum and sum of squares)
    public static int[] findOptimal(int[] arr) {
        int n = arr.length;
        long sumN = (long) n * (n + 1) / 2;
        long sumSqN = (long) n * (n + 1) * (2L * n + 1) / 6;

        long sum = 0, sumSq = 0;
        for (int num : arr) {
            sum += num;
            sumSq += (long) num * num;
        }

        long diff = sum - sumN; // repeating - missing
        long diffSq = sumSq - sumSqN; // repeating^2 - missing^2

        long sumRM = diffSq / diff; // repeating + missing

        int repeating = (int) ((diff + sumRM) / 2);
        int missing = (int) (sumRM - repeating);

        return new int[]{repeating, missing};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int[] brute = findBrute(arr);
        System.out.println("Brute Force -> Repeating: " + brute[0] + ", Missing: " + brute[1]);

        int[] optimal = findOptimal(arr);
        System.out.println("Optimal -> Repeating: " + optimal[0] + ", Missing: " + optimal[1]);
    }
}
