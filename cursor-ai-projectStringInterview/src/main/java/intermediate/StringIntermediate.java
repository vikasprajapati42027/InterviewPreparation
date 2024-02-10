package intermediate;

/**
 * This class demonstrates intermediate operations on strings in Java.
 */
public class StringIntermediate {

    /**
     * Illustrates checking if a string contains a certain sequence of characters.
     */
    public static void stringContains() {
        String sentence = "The quick brown fox jumps over the lazy dog";
        // Checking if the sentence contains the word "fox"
        boolean containsFox = sentence.contains("fox"); // true
        System.out.println("Sentence contains 'fox': " + containsFox);
    }

    /**
     * Demonstrates extracting a substring from a string.
     */
    public static void stringSubstring() {
        String sentence = "The quick brown fox";
        // Extracting "quick" from the sentence
        String extracted = sentence.substring(4, 9);
        System.out.println("Extracted substring: " + extracted);
    }

    /**
     * Shows how to replace characters in a string.
     */
    public static void stringReplace() {
        String sentence = "The quick brown fox";
        // Replacing 'o' with 'a'
        String replacedSentence = sentence.replace('o', 'a');
        System.out.println("Replaced string: " + replacedSentence);
    }

    /**
     * Demonstrates splitting a string into an array of substrings.
     */
    public static void stringSplit() {
        String sentence = "The quick brown fox jumps over the lazy dog";
        // Splitting the sentence into words
        String[] words = sentence.split(" ");
        System.out.println("Splitted into words:");
        for (String word : words) {
            System.out.println(word);
        }
    }

    /**
     * Illustrates trimming leading and trailing spaces from a string.
     */
    public static void stringTrim() {
        String sentence = "   The quick brown fox   ";
        // Trimming the sentence
        String trimmedSentence = sentence.trim();
        System.out.println("Trimmed string: '" + trimmedSentence + "'");
    }

    public static void main(String[] args) {
        stringContains();
        stringSubstring();
        stringReplace();
        stringSplit();
        stringTrim();
    }
}
