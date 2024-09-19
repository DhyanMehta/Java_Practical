import java.util.*;
 class DateTest {
    public static void main(String[] args) {
        Date d1 =new Date();
        d1.get();
        d1.put_data();
    }
    
}
class Date
{
    Scanner sc= new Scanner(System.in);
    int date,month,year;
    Date()
    {
        date=1;
        month=1;
        year=1;
    }
    void get()
    {
        System.out.println("Enter date:");
        date=sc.nextInt();
        System.out.println("Enter month:");
        month=sc.nextInt();
        System.out.println("Enter year:");
        year=sc.nextInt();
    }
    void put_data()
    {
        System.out.println(date + "/"+ month+"/"+year);
    }
}
