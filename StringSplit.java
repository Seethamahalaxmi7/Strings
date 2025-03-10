public class StringSplit {
    public static void main(String[] args) {
        String str = "apple,banana,cherry,grape";
        
        // Split the string using the comma delimiter
        String[] fruits = str.split(",");
        
        // Print each substring in the resulting array
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
