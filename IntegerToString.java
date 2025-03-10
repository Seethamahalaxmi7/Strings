public class IntegerToString {
    public static void main(String[] args) {
        // Integer object
        Integer num = 123;

        // Method 1: Using toString() method
        String str1 = num.toString();
        System.out.println("Using toString(): " + str1);

        // Method 2: Using String.valueOf()
        String str2 = String.valueOf(num);
        System.out.println("Using String.valueOf(): " + str2);

        // Method 3: Using concatenation with an empty string
        String str3 = num + "";
        System.out.println("Using concatenation: " + str3);

        // Method 4: Using String.format()
        String str4 = String.format("%d", num);
        System.out.println("Using String.format(): " + str4);

        // Method 5: Using Integer.toString()
        String str5 = Integer.toString(num);
        System.out.println("Using Integer.toString(): " + str5);
    }
}
