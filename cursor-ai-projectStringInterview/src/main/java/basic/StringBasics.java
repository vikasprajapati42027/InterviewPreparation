package basic;

/**
 * This class demonstrates basic operations on strings in Java.
 */
public class StringBasics {

    /**
     * Shows basic string creation and printing.
     */
    public static void stringCreationAndPrint() {
        // Creating a string using string literal
        String greeting = "Hello, World!";
        System.out.println("String: " + greeting);
    }

    /**
     * Demonstrates string concatenation.
     */
    public static void stringConcatenation() {
        // Concatenating strings using the '+' operator
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);
    }

    /**
     * Illustrates finding the length of a string.
     */
    public static void stringLength() {
        String sample = "Hello, World!";
        // Finding the length of the string
        int length = sample.length();
        System.out.println("Length of the string '" + sample + "' is: " + length);
    }

    /**
     * Demonstrates converting a string to uppercase and lowercase.
     */
    public static void stringCaseConversion() {
        String mixedCase = "JaVa ProGrAmMiNg";
        // Converting to uppercase
        String upperCase = mixedCase.toUpperCase();
        // Converting to lowercase
        String lowerCase = mixedCase.toLowerCase();
        System.out.println("Original: " + mixedCase);
        System.out.println("Uppercase: " + upperCase);
        System.out.println("Lowercase: " + lowerCase);
    }

    /**
     * Shows how to compare two strings for equality.
     */
    public static void stringComparison() {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "hello";
        // Comparing strings using equals() method
        boolean isEqual = str1.equals(str2); // true
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str3); // true
        System.out.println("str1 equals str2: " + isEqual);
        System.out.println("str1 equalsIgnoreCase str3: " + isEqualIgnoreCase);
    }

    public static void main(String[] args) {
        stringCreationAndPrint();
        stringConcatenation();
        stringLength();
        stringCaseConversion();
        stringComparison();
    }
}
