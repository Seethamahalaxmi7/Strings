public class StringTrimming {
    public static void main(String[] args) {
        String str = "   Hello, world!   ";
        System.out.println("Original string: '" + str + "'");
        
        String trimmedStr = str.trim();
        System.out.println("Trimmed string: '" + trimmedStr + "'");
    }
}
