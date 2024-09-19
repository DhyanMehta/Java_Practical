import java.util.*;
public class Practical_12 {
    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    float amt,val;
    System.out.println("Enter amount in Poound : ");
    amt=sc.nextFloat();
    val=amt*100;
    System.out.println("The amount in ruppees : "+ val);
    float a=Float.parseFloat(args[0]);
    val=a*100;
    System.out.println("The amount in ruppees : "+ val);

    }
}
