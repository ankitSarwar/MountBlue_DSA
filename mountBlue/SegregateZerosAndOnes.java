package mountBlue;

import java.util.Arrays;

public class SegregateZerosAndOnes {
    public static void segregateZerosAndOnes(int[] arr) {
        int leftPointer = 0;
        int rightPointer = arr.length - 1;

        while (leftPointer < rightPointer) {
            // Move leftPointer to the first occurrence of 1
            while (arr[leftPointer] == 0 && leftPointer < rightPointer) {
                leftPointer++;
            }

            // Move rightPointer to the first occurrence of 0
            while (arr[rightPointer] == 1 && leftPointer < rightPointer) {
                rightPointer--;
            }

            // Swap 0s and 1s if leftPointer is still less than rightPointer
            if (leftPointer < rightPointer) {
                int temp = arr[leftPointer];
                arr[leftPointer] = arr[rightPointer];
                arr[rightPointer] = temp;
                leftPointer++;
                rightPointer--;
            }
        }
    }

    public static void main(String[] args) {
        // Example usage:
        int[] arr = {0, 1, 0, 1, 0, 0, 1, 1, 1, 0};
        segregateZerosAndOnes(arr);

//        System.out.println("Output array: " + Arrays.toString(arr));
        for(int e:arr){
            System.out.print(e+" ");
        }
    }
}
