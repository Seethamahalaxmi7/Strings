public class StringSubstring {
    public static void main(String[] args) {
        // Using String Literal
        String str = "Hello, World!";

        // Extracting a substring from index 7 to the end of the string
        String substring1 = str.substring(7);

        // Extracting a substring from index 0 to 5 (excluding index 5)
        String substring2 = str.substring(0, 5);

        // Printing the extracted substrings
        System.out.println("Substring from index 7 to the end: " + substring1);
        System.out.println("Substring from index 0 to 5: " + substring2);
    }
}
