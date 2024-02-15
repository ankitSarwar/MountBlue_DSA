package mountBlue;

public class MinMaxColumn {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15, 16, 17, 18, 19, 20},
                {0,5,9,66,200,0,2,3,4,9}
        };

        // Assuming a rectangular matrix
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Arrays to store minimum and maximum values of each column
        int[] minValues = new int[cols];
        int[] maxValues = new int[cols];

        // Initialize minValues array with max integer value and maxValues array with min integer value
        for (int i = 0; i < cols; i++) {
            minValues[i] = Integer.MAX_VALUE;
            maxValues[i] = Integer.MIN_VALUE;
        }

        // Find the minimum and maximum values for each column
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                // Update minimum value if current element is smaller
                if (matrix[i][j] < minValues[j]) {
                    minValues[j] = matrix[i][j];
                }
                // Update maximum value if current element is larger
                if (matrix[i][j] > maxValues[j]) {
                    maxValues[j] = matrix[i][j];
                }
            }
        }

        // Print the minimum values
        System.out.println("Minimum values of each column:");
        for (int minValue : minValues) {
            System.out.print(minValue + " ");
        }

        System.out.println(); // Move to the next line

        // Print the maximum values
        System.out.println("Maximum values of each column:");
        for (int maxValue : maxValues) {
            System.out.print(maxValue + " ");
        }
    }
}
