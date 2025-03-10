import java.util.ArrayList;
import java.util.List;

public class StringManipulation {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
        String str3 = "Hello, world!";
        String str4 = "   Hello, world!   ";

        // equalsIgnoreCase(): Compares content of two strings for equality, ignoring case differences
        System.out.println("equalsIgnoreCase:");
        System.out.println(str1.equalsIgnoreCase(str2)); // Outputs: true
        System.out.println(str1.equalsIgnoreCase(str3)); // Outputs: false

        // startsWith(): Checks if a string starts with a specified prefix
        System.out.println("startsWith:");
        System.out.println(str3.startsWith("Hello")); // Outputs: true
        System.out.println(str3.startsWith("world")); // Outputs: false

        // endsWith(): Checks if a string ends with a specified suffix
        System.out.println("endsWith:");
        System.out.println(str3.endsWith("world!")); // Outputs: true
        System.out.println(str3.endsWith("Hello")); // Outputs: false

        // compareTo(): Compares two strings lexicographically
        System.out.println("compareTo:");
        System.out.println(str1.compareTo(str2)); // Outputs: -32 (difference between 'H' and 'h')
        System.out.println(str2.compareTo(str1)); // Outputs: 32 (difference between 'h' and 'H')

        // trim(): Removes leading and trailing whitespace from a string
        System.out.println("trim:");
        System.out.println("Original string: '" + str4 + "'");
        System.out.println("Trimmed string: '" + str4.trim() + "'");

        // replace(): Replaces characters in strings
        System.out.println("replace:");
        String replacedStr1 = str3.replace('o', 'a');
        System.out.println("Replaced string 1: " + replacedStr1); // Outputs: Hella, warld!
        String replacedStr2 = str3.replace("world", "universe");
        System.out.println("Replaced string 2: " + replacedStr2); // Outputs: Hello, universe!

        // split(): Splits strings into an array of substrings
        System.out.println("split:");
        String fruits = "apple,banana,cherry,grape";
        String[] fruitArray = fruits.split(",");
        for (String fruit : fruitArray) {
            System.out.println(fruit); // Outputs: apple, banana, cherry, grape
        }

        // valueOf(): Converts numbers to strings
        System.out.println("valueOf:");
        int number = 123;
        String numStr = String.valueOf(number);
        System.out.println("String representation of the number: " + numStr);

        // Regular expression with matches()
        System.out.println("matches:");
        String regexStr = "Hello123";
        String regex = "\\w+\\d+";
        boolean matches = regexStr.matches(regex);
        System.out.println("Does the string match the regex? " + matches); // Outputs: true
    }

    // Method to find all substring indices
    public static List<Integer> findSubstringIndices(String mainString, String searchTerm) {
        List<Integer> indices = new ArrayList<>();
        int index = mainString.indexOf(searchTerm);
        while (index >= 0) {
            indices.add(index);
            index = mainString.indexOf(searchTerm, index + searchTerm.length());
        }
        return indices;
    }
}
