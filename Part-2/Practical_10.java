import java.util.Arrays;
import java.util.Scanner;

public class Practical_10 {
        public static void main(String[] args) {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        str=sc.nextLine();
        System.out.println("Length of the String is "+str.length());
        System.out.println("String in lowecase : "+ str.toLowerCase());
        System.out.println("String in uppercase : "+ str.toUpperCase());
        StringBuilder sb=new StringBuilder(str);
        sb.reverse().toString();
        System.out.println("Reverse String : "+ sb);
        char[] ch=str.toCharArray();
        Arrays.sort(ch);
        String str1=new String(ch);
        System.out.println("Sorted String : "+ str1);
        sc.close();
    }
}
