import java.util.Scanner;

public class Practical_9 {
        public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        str=sc.nextLine();
        StringBuilder sb=new StringBuilder();
     
        for(char ch: str.toCharArray()){
            sb.append(ch).append(ch);
                }
                sb.toString();
                System.out.println(sb);
    }
}
