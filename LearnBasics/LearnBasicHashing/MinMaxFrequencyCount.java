import java.util.*;

public class MinMaxFrequencyCount {

    public static void main(String args[]) {
        int arr[] = {10, 5, 10, 15, 10, 5};
        int n = arr.length;
        countFreq(arr, n);
    }

    public static void countFreq(int arr[], int n) {
        boolean visited[] = new boolean[n];
        int maxFreq = 0, minFreq = n;
        int maxEle = 0, minEle = 0;

        for (int i = 0; i < n; i++) {
            // Skip this element if already processed
            if (visited[i]) {
                continue;
            }

            // Count frequency of arr[i]
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }

            // Update max frequency element
            if (count > maxFreq) {
                maxFreq = count;
                maxEle = arr[i];
            }

            // Update min frequency element
            if (count < minFreq) {
                minFreq = count;
                minEle = arr[i];
            }
        }

        System.out.println("The highest frequency element is: " + maxEle + " (occurs " + maxFreq + " time(s))");
        System.out.println("The lowest frequency element is: " + minEle + " (occurs " + minFreq + " time(s))");
    }
}
