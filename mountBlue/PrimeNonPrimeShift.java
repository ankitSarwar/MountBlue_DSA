package mountBlue;

public class PrimeNonPrimeShift {
    public static void main(String[] args) {
        int[] arr = {1, 4, 3, 8, 7, 12, 5, 6};

        // Shift non-prime numbers to the left and prime numbers to the right
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Move left pointer to find the first non-prime number
            while (left < right && !isPrime(arr[left])) {
                left++;
            }
            // Move right pointer to find the first prime number
            while (left < right && isPrime(arr[right])) {
                right--;
            }

            // Swap elements at left and right indices
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            // Move pointers to continue searching for numbers
            left++;
            right--;
        }

        // Print the modified array
        for (int num : arr) {
            System.out.print(num + " ");
        }
        // output -1 4 6 8 12 7 5 3
    }
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

