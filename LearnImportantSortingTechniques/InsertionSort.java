import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] arr) {
        for(int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the array :");
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        System.out.println("After applying sorting algorithm :");
        insertionSort(arr);
        for(int x : arr) System.out.print(x + " ");
    }
}
