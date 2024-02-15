package mountBlue;

import java.util.HashMap;
import java.util.HashSet;

public class FrogJump {
    public static void main(String[] args) {
        int arr[]={0,1,3,5,6,8,12,17};
//        int arr[]={0,1,2,3,4,8,9,11};
        // Create a HashMap to store the possible jump positions for each stone
        HashMap<Integer, HashSet<Integer>> hm = new HashMap<>();
        int n = arr.length;

        // Initialize the HashMap with stones and an empty HashSet for each stone
        for (int i = 0; i < n; i++) {
            hm.put(arr[i], new HashSet<Integer>());
        }

        // Add the initial jump possibility for the first stone
        hm.get(arr[0]).add(1);

        // Iterate through each stone
        for (int i = 0; i < n; i++) {
            // Get the set of possible jumps for the current stone
            HashSet<Integer> set = hm.get(arr[i]);
            System.out.println(hm.get(arr[i]));
            // Iterate through each possible jump for the current stone
            for (int j : set) {
                // Calculate the next position after jumping
                int pos = arr[i] + j;

                // If the next position is the last stone, return true
                if (pos == arr[n - 1]) {
//                    return true;
                    System.out.println(true);
                    return;
                }

                // If the next position is in the list of stones, update the possible jumps for that stone
                if (hm.containsKey(pos)) {
                    // If j-1 is non-negative, add j-1 to the set
                    if (j - 1 >= 0) {
                        hm.get(pos).add(j - 1);
                    }
                    // Add j and j+1 to the set
                    hm.get(pos).add(j);
                    hm.get(pos).add(j + 1);
                }
            }
        }

        // If we reach here, there is no way to jump to the last stone
        System.out.println(false);
//        return false;

    }
}
