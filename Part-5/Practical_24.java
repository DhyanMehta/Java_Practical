import java.util.*;
public class Practical_24 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter integer :");
        int a=sc.nextInt();
        System.out.println("Enter integer :");
        int b=sc.nextInt();
        try {
            int ans=a/b;
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
