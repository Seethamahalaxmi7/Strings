public class StringUtilities {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
        String str3 = "Hello, world!";
        String str4 = "world!";
        String str5 = "Hello";

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
        System.out.println(str1.compareTo(str5)); // Outputs: 0
        System.out.println(str1.compareTo(str2)); // Outputs: -32 (difference between 'H' and 'h')
        System.out.println(str2.compareTo(str1)); // Outputs: 32 (difference between 'h' and 'H')
    }
}
