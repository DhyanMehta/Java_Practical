import java.util.*;
 class employeeTest {
    public static void main(String[] args) {
        emplyee emp1=new emplyee();
        emplyee emp2=new emplyee();
        emp1.get_data();
        emp1.put_data();
        emp1.yearly_salary();
        emp1.salary_raise();
        emp2.get_data();
        emp2.put_data();
        emp2.yearly_salary();
        emp2.salary_raise();

    }
}
class emplyee{
    String First_Name , Last_Name;
    double salary;
    double yearly,raise;
    Scanner sc=new Scanner(System.in);
    emplyee(){
        First_Name="NULL";
        Last_Name="NULL";
        salary=0.0;
    }
    void get_data(){
        System.out.println("Enter First name of employee : ");
        First_Name=sc.nextLine();
        System.out.println("Enter Last name of employee : ");
        Last_Name=sc.nextLine();
        System.out.println("Enter Monthly Salary of employee : ");
        salary=sc.nextDouble();
        if(salary<0){
            salary=0.0;
        }
        
        
    }
    void put_data(){
        System.out.println("Name : "+First_Name + " " + Last_Name);
        System.out.println("Monthly Salary : " + salary);
    }
    void yearly_salary(){
         yearly=salary*12;
        System.out.println("The yearly Salary of "+ First_Name +" is : "+ yearly);
    }
    void salary_raise(){
         raise=yearly*0.1;
         System.out.println("Yearly Salary after increamnet : "+ yearly+raise);
         System.out.println("Monthly Salary after increamnet : "+ salary+raise);

    }

}
