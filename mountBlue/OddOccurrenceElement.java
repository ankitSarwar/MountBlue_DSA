package mountBlue;
import java.util.HashMap;
public class OddOccurrenceElement {
    public static void main(String args[]) {
        int arr[] = {6, 5, 2, 5, 4, 2, 6};
        int n = arr.length;

        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Count the frequency of each element in the array
        for (int i = 0; i < n; i++) {
            frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i], 0) + 1);
        }

        // Find the number occurring odd number of times
        for (int i = 0; i < n; i++) {
            if (frequencyMap.get(arr[i]) % 2 != 0) {
                System.out.println("The number occurring odd number of times is: " + arr[i]);
                return;
            }
        }

        System.out.println("There is no number occurring odd number of times.");
    }
}
