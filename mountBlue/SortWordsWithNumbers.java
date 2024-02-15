package mountBlue;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortWordsWithNumbers {
    public static void main(String[] args) {
        // Input string containing words with numbers
        String input = "my1 name2 is4 a3rpit";

        // Split the input string into a list of words
        List<String> words = Arrays.asList(input.split("\\s+"));

        // Sort the list of words based on the numeric parts using a custom comparator
        Collections.sort(words, new Comparator<String>() {
            public int compare(String o1, String o2) {
                // Compare words based on their numeric parts
                return extractNumber(o1) - extractNumber(o2);
            }
        });
        // Print the sorted words as a space-separated string
        System.out.println(String.join(" ", words));
    }
    // Method to extract the numeric part from a word
    private static int extractNumber(String word) {
        // Remove non-digit characters and parse the numeric part to an integer
        return Integer.parseInt(word.replaceAll("\\D", ""));
    }
}