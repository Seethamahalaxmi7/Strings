public class RegexExample {
    public static void main(String[] args) {
        String str = "Hello123";
        String regex = "\\w+\\d+";

        boolean matches = str.matches(regex);

        System.out.println("Does the string match the regex? " + matches);
        // Outputs: Does the string match the regex? true
    }
}
