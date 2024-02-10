package advanced;

/**
 * This class demonstrates advanced operations on strings in Java.
 */
public class StringAdvanced {

    /**
     * Illustrates checking if a string starts with a certain prefix.
     */
    public static void stringStartsWith() {
        String sentence = "Java programming is fun";
        // Checking if the sentence starts with "Java"
        boolean startsWithJava = sentence.startsWith("Java"); // true
        System.out.println("Sentence starts with 'Java': " + startsWithJava);
    }

    /**
     * Demonstrates checking if a string ends with a certain suffix.
     */
    public static void stringEndsWith() {
        String sentence = "Java programming is fun";
        // Checking if the sentence ends with "fun"
        boolean endsWithFun = sentence.endsWith("fun"); // true
        System.out.println("Sentence ends with 'fun': " + endsWithFun);
    }

    /**
     * Shows how to find the index of a character or substring within a string.
     */
    public static void stringIndexOf() {
        String sentence = "Java programming is fun";
        // Finding the index of character 'a'
        int indexOfA = sentence.indexOf('a'); // 1
        // Finding the index of substring "programming"
        int indexOfProgramming = sentence.indexOf("programming"); // 5
        System.out.println("Index of 'a': " + indexOfA);
        System.out.println("Index of 'programming': " + indexOfProgramming);
    }

    /**
     * Demonstrates converting a string to a character array.
     */
    public static void stringToCharArray() {
        String sentence = "Java";
        // Converting string to char array
        char[] charArray = sentence.toCharArray();
        System.out.print("Char array: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();
    }

    /**
     * Illustrates using the String.format method for string formatting.
     */
    public static void stringFormat() {
        String name = "John";
        int age = 30;
        // Formatting string
        String formattedString = String.format("Name: %s, Age: %d", name, age);
        System.out.println(formattedString);
    }

    /**
     * Demonstrates using the StringBuilder for efficient string manipulation.
     */
    public static void stringBuilderUsage() {
        StringBuilder sb = new StringBuilder();
        sb.append("Java");
        sb.append(" programming");
        sb.append(" is");
        sb.append(" fun");
        String sentence = sb.toString();
        System.out.println(sentence);
    }

    public static void main(String[] args) {
        stringStartsWith();
        stringEndsWith();
        stringIndexOf();
        stringToCharArray();
        stringFormat();
        stringBuilderUsage();
    }
}
