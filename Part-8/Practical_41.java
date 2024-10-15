import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class Practical_41 {


    public static void main(String[] args) {
        Set<String> keywords = new HashSet<>();
        String[] keywordArray = {
            "abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", 
            "class", "const", "continue", "default", "do", "double", "else", "enum", 
            "extends", "final", "finally", "float", "for", "goto", "if", "implements", 
            "import", "instanceof", "int", "interface", "long", "native", "new", 
            "null", "package", "private", "protected", "public", "return", "short", 
            "static", "strictfp", "super", "switch", "synchronized", "this", "throw", 
            "throws", "transient", "try", "void", "volatile", "while"
        };
        
        for (String keyword : keywordArray) {
            keywords.add(keyword);
        }
        
        Scanner scanner = new Scanner(System.in);
        String code = scanner.useDelimiter("\\Z").next();
        String[] words = code.split("\\s+");

        int count = 0;
        for (String word : words) {
            if (keywords.contains(word)) {
                count++;
            }
        }

        System.out.println("Number of keywords: " + count);
    
}

}
