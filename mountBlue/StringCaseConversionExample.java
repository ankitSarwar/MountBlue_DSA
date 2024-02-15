package mountBlue;

import java.util.HashMap;
import java.util.Map;

public class StringCaseConversionExample {
    public static void main(String[] args) {
        String str = "Hello, World!";

        // Convert to lowercase without inbuilt method
        char[] characters = str.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            if (characters[i] >= 'A' && characters[i] <= 'Z') {
                characters[i] = (char) (characters[i] + 32); // ASCII value difference between 'a' and 'A' ('a' - 'A')
            }
        }

        System.out.println("Lowercase String: " + new String(characters));

        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'a' && ch[i] <= 'z') {
                ch[i] = (char) (ch[i] - 32); // ASCII value difference between 'a' and 'A'
            }
        }
        System.out.println("Uppercase String: " +new String(ch) );
    }
}




class CharacterFrequency {
    public static void main(String[] args) {

        String str = "geeksforgeeks";
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Step 1: Create a frequency map
        for (char ch : str.toCharArray()) {
            frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Print characters and their frequencies in order of occurrence
        for (char ch : str.toCharArray()) {
            if (frequencyMap.containsKey(ch)) {
                System.out.print(ch + "" + frequencyMap.get(ch) + " ");
                frequencyMap.remove(ch); // Mark the character as processed
            }
        }
    }
}



