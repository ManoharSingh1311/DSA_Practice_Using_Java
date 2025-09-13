import java.util.Scanner;

public class LeftRotate {
    public static void leftRotateByOne(int[] arr) {
        int first = arr[0];
        for(int i=1; i<arr.length; i++) {
            arr[i-1] = arr[i];
        }
        arr[arr.length-1] = first;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();
        leftRotateByOne(arr);
        for(int x : arr) System.out.print(x + " ");
    }
}
