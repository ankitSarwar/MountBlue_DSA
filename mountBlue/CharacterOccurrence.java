package mountBlue;

import java.util.HashMap;

public class CharacterOccurrence {
    public static void main(String[] args) {
        String str = "GeeksForGeeks";

        // Create a HashMap to store character occurrences
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Count the occurrence of each character in the string
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Print the character occurrences
        for (char key : charCountMap.keySet()) {
            System.out.println(key + " " + charCountMap.get(key));
        }
    }
}
