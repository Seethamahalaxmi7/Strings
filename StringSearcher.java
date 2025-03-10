import java.util.ArrayList;
import java.util.List;

public class StringSearcher {
    private String mainString;

    public StringSearcher(String mainString) {
        this.mainString = mainString;
    }

    public List<Integer> findSubstringIndices(String searchTerm) {
        List<Integer> indices = new ArrayList<>();
        int index = mainString.indexOf(searchTerm);
        while (index >= 0) {
            indices.add(index);
            index = mainString.indexOf(searchTerm, index + searchTerm.length());
        }
        return indices;
    }

    public static void main(String[] args) {
        StringSearcher searcher = new StringSearcher("Hello, world! Hello, universe!");
        List<Integer> indices = searcher.findSubstringIndices("Hello");

        System.out.println("Found at indices: " + indices);
        // Outputs: Found at indices: [0, 13]
    }
}
