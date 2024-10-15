import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
public class Practical_40 {

 
    public static void main(String[] args) {
        Map<String, Integer> wordCount = new TreeMap<>();
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        String[] words = text.split("\\s+");

        for (String word : words) {
            word = word.toLowerCase();
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for (String word : wordCount.keySet()) {
            System.out.println(word + ": " + wordCount.get(word));
        }
    
}

}
