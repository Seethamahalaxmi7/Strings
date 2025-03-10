public class StringComparison {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = "hello";

        // equals(): Compares content of two strings for equality
        System.out.println(str1.equals(str2)); // Outputs: true
        System.out.println(str1.equals(str3)); // Outputs: false

        // equalsIgnoreCase(): Compares content of two strings for equality, ignoring case differences
        System.out.println(str1.equalsIgnoreCase(str3)); // Outputs: true

        // compareTo(): Compares two strings lexicographically
        System.out.println(str1.compareTo(str2)); // Outputs: 0
        System.out.println(str1.compareTo(str3)); // Outputs: -32
        System.out.println(str3.compareTo(str1)); // Outputs: 32

        // compareToIgnoreCase(): Compares two strings lexicographically, ignoring case differences
        System.out.println(str1.compareToIgnoreCase(str3)); // Outputs: 0

        // contentEquals(): Compares a String to a StringBuffer or StringBuilder for equality
        StringBuffer stringBuffer = new StringBuffer("Hello");
        System.out.println(str1.contentEquals(stringBuffer)); // Outputs: true
    }
}
