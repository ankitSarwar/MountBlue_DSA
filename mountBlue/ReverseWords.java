package mountBlue;

public class ReverseWords {
    public static void main(String[] args) {
        String input = "Hello World! Java Programming is Fun";
        String[] words = input.split("\\s+");

        // Reverse the order of words
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" ");
            }
        }
        System.out.println(reversed.toString());
    }
}
