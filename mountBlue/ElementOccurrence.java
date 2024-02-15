package mountBlue;

import java.util.HashMap;

public class ElementOccurrence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 1, 2, 4, 5, 2, 3, 1};

        // Create a HashMap to store element occurrences
        HashMap<Integer, Integer> elementCountMap = new HashMap<>();

        // Count the occurrence of each element in the array
        for (int num : arr) {
            elementCountMap.put(num, elementCountMap.getOrDefault(num, 0) + 1);
        }

        // Print the element occurrences
        for (int key : elementCountMap.keySet()) {
            System.out.println(key + " " + elementCountMap.get(key));
        }
    }
}
