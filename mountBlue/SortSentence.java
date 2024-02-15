package mountBlue;

import java.util.Arrays;
import java.util.Comparator;

public class SortSentence {
    public static void main(String[] args) {
        String[] input = {"2a", "grea3t", "l3earning", "geeksfor0geeks", "p10latform", "is1"};

        Arrays.sort(input, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int num1 = extractInteger(s1);
                int num2 = extractInteger(s2);

                int result = Integer.compare(num1, num2);

                if (result == 0) {
                    return s1.compareTo(s2);
                }

                return result;
            }

            private int extractInteger(String s) {
                StringBuilder numString = new StringBuilder();
                for (char c : s.toCharArray()) {
                    if (Character.isDigit(c)) {
                        numString.append(c);
                    }
                }
                return numString.length() > 0 ? Integer.parseInt(numString.toString()) : Integer.MAX_VALUE;
            }
        });

        System.out.println("Sorted Sentence: " + Arrays.toString(input));
    }
}
