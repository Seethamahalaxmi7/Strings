public class StringReplace {
    public static void main(String[] args) {
        String str = "Hello, world!";
        
        // Replace character 'o' with 'a'
        String replacedStr1 = str.replace('o', 'a');
        System.out.println("Replaced string 1: " + replacedStr1);
        // Outputs: Hella, warld!

        // Replace substring "world" with "universe"
        String replacedStr2 = str.replace("world", "universe");
        System.out.println("Replaced string 2: " + replacedStr2);
        // Outputs: Hello, universe!
    }
}
