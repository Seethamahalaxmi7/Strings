public class StringExamples {
    public static void main(String[] args) {
        // Using String Literal
        String str1 = "Hello, World!";
        System.out.println("Using String Literal: " + str1);

        // Using new Keyword
        String str2 = new String("Hello, World!");
        System.out.println("Using new Keyword: " + str2);

        // Using char Array
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str3 = new String(charArray);
        System.out.println("Using char Array: " + str3);

        // Using StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(", ");
        sb.append("World!");
        String str4 = sb.toString();
        System.out.println("Using StringBuilder: " + str4);

        // Using StringBuffer
        StringBuffer sbf = new StringBuffer();
        sbf.append("Hello");
        sbf.append(", ");
        sbf.append("World!");
        String str5 = sbf.toString();
        System.out.println("Using StringBuffer: " + str5);

        // Using String.format
        String str6 = String.format("%s, %s!", "Hello", "World");
        System.out.println("Using String.format: " + str6);

        // Using String.valueOf
        int number = 123;
        String str7 = String.valueOf(number);
        System.out.println("Using String.valueOf: " + str7);
    }
}
