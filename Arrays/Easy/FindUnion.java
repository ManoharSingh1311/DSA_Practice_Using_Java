import java.util.*;

public class FindUnion {

    // Brute Force: Using HashSet
    public static List<Integer> unionBrute(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int x : arr1) set.add(x);
        for (int x : arr2) set.add(x);
        return new ArrayList<>(set);
    }

    // Optimal: Two-pointer approach (arrays must be sorted)
    public static List<Integer> unionOptimal(int[] arr1, int[] arr2) {
        List<Integer> result = new ArrayList<>();
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                if (result.isEmpty() || result.get(result.size() - 1) != arr1[i])
                    result.add(arr1[i]);
                i++;
            } else if (arr2[j] < arr1[i]) {
                if (result.isEmpty() || result.get(result.size() - 1) != arr2[j])
                    result.add(arr2[j]);
                j++;
            } else {
                if (result.isEmpty() || result.get(result.size() - 1) != arr1[i])
                    result.add(arr1[i]);
                i++;
                j++;
            }
        }
        while (i < arr1.length) {
            if (result.isEmpty() || result.get(result.size() - 1) != arr1[i])
                result.add(arr1[i]);
            i++;
        }
        while (j < arr2.length) {
            if (result.isEmpty() || result.get(result.size() - 1) != arr2[j])
                result.add(arr2[j]);
            j++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();

        List<Integer> bruteResult = unionBrute(arr1, arr2);
        System.out.print("Brute Force Result: ");
        for (int x : bruteResult) System.out.print(x + " ");
        System.out.println();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        List<Integer> optimalResult = unionOptimal(arr1, arr2);
        System.out.print("Optimal Result: ");
        for (int x : optimalResult) System.out.print(x + " ");
    }
}
