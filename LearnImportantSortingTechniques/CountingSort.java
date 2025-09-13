import java.util.*;

public class CountingSort {
    public static void countingSort(int[] arr) {
        if(arr.length == 0) return;
        
        int max = arr[0], min = arr[0];
        for(int num : arr) {
            if(num > max) max = num;
            if(num < min) min = num;
        }
        
        int range = max - min + 1;
        int[] count = new int[range];
        int[] output = new int[arr.length];
        
        for(int num : arr) count[num - min]++;
        
        for(int i = 1; i < count.length; i++) {
            count[i] += count[i-1];
        }
        
        for(int i = arr.length - 1; i >= 0; i--) {
            output[count[arr[i] - min] - 1] = arr[i];
            count[arr[i] - min]--;
        }
        
        for(int i = 0; i < arr.length; i++) arr[i] = output[i];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        countingSort(arr);
        for(int x : arr) System.out.print(x + " ");
    }
}
