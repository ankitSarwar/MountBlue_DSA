package mountBlue;

public class MoveZeroesToEnd {
    public static void main(String[] args) {
        // Example usage:
        int[] arr = {1, 8, 3, 0, 2, 0, 1, 10, 13, 0};

        int n = arr.length;
        int nonZeroIndex = 0;

        // Move non-zero elements to the beginning
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[nonZeroIndex] = arr[i];
                nonZeroIndex++;
            }
        }
        // Fill the remaining positions with zeroes
        for (int i = nonZeroIndex; i < n; i++) {
            arr[i] = 0;
        }
        for(int e:arr){
            System.out.print(e+" ");
        }
    }
    public static void moveZeroesOneTraversal(int[] arr) {
        // Second Approch
        int n = arr.length;
        int nonZeroIndex = 0;

        // One traversal: move non-zero elements to the beginning and swap with zero elements
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                // Swap non-zero element with the current nonZeroIndex
                int temp = arr[i];
                arr[i] = arr[nonZeroIndex];
                arr[nonZeroIndex] = temp;

                nonZeroIndex++;
            }
        }
    }
}
