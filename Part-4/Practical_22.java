import java.util.*;
interface AdvancedArithmetic{
    int divisor_sum(int n);
    
}
class Mycalculator implements AdvancedArithmetic{
    int count=0;
    public int divisor_sum(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count+=i;
            }
        }
        return count;
    }
}
public class Practical_22{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to find sum of divisor :");
        int n=sc.nextInt();
        Mycalculator cal=new Mycalculator();
        int ans=cal.divisor_sum(n);
        System.out.println("The sum of the divisors :  "+ans);
    }
}