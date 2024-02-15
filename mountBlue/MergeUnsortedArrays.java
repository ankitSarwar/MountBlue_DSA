package mountBlue;

import java.util.Arrays;

public class MergeUnsortedArrays {
    public static int[] sortedMerge(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int[] mergedArray = new int[n + m];

        int i = 0, j = 0, k = 0;
        // Merge arrays while maintaining the sorted order
        while (i < n && j < m) {
            if (a[i] < b[j]) {
                mergedArray[k] = a[i];
                i++;
            } else {
                mergedArray[k] = b[j];
                j++;
            }
            k++;
        }
        // Copy the remaining elements from array 'a', if any
        while (i < n) {
            mergedArray[k] = a[i];
            i++;
            k++;
        }
        // Copy the remaining elements from array 'b', if any
        while (j < m) {
            mergedArray[k] = b[j];
            j++;
            k++;
        }
        return mergedArray;
    }
    public static void main(String[] args) {
        // Example usage:
        int[] a1 = {10, 5, 15};
        int[] b1 = {20, 3, 2};
        int[] result1 = sortedMerge(a1, b1);
        System.out.println("Merge List: " + Arrays.toString(result1));

        int[] a2 = {1, 10, 5, 15};
        int[] b2 = {20, 0, 2};
        int[] result2 = sortedMerge(a2, b2);
        System.out.println("Merge List: " + Arrays.toString(result2));
    }
}
