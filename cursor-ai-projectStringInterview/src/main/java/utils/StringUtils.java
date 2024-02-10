package utils;

/**
 * This class provides utility methods for string manipulation.
 */
public class StringUtils {

    /**
     * Checks if a string is null or empty.
     * 
     * @param str the string to check
     * @return true if the string is null or empty, false otherwise
     */
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }

    /**
     * Reverses a given string.
     * 
     * @param str the string to reverse
     * @return the reversed string
     */
    public static String reverse(String str) {
        if (isNullOrEmpty(str)) {
            return str;
        }
        return new StringBuilder(str).reverse().toString();
    }

    /**
     * Counts the number of occurrences of a char in a string.
     * 
     * @param str the string to search
     * @param ch the char to count
     * @return the number of occurrences
     */
    public static int countOccurrences(String str, char ch) {
        if (isNullOrEmpty(str)) {
            return 0;
        }
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }
        return count;
    }

    /**
     * Checks if a string contains only digits.
     * 
     * @param str the string to check
     * @return true if the string contains only digits, false otherwise
     */
    public static boolean isNumeric(String str) {
        if (isNullOrEmpty(str)) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Capitalizes the first letter of each word in a string.
     * 
     * @param str the string to capitalize
     * @return the capitalized string
     */
    public static String capitalizeWords(String str) {
        if (isNullOrEmpty(str)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String[] words = str.split("\\s+");
        for (String word : words) {
            if (!word.isEmpty()) {
                sb.append(Character.toUpperCase(word.charAt(0)))
                  .append(word.substring(1).toLowerCase())
                  .append(" ");
            }
        }
        return sb.toString().trim();
    }
}
