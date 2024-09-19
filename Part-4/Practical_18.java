class member{
    protected
    String name,add;
    int age;
    float sal;
    long  num;
    public
    member(String name, int age, long num, String add, float sal){
        this.name=name;
        this.age=age;
        this.num=num;
        this.add=add;
        this.sal=sal;

    }
    void printSalary(){
        System.out.println("Salary of thr employee = "+sal);

    }
}
class Employee extends  member{
    private String specialization;
    Employee(String name, int age, long num, String add, float sal, String specialization){
        super(name,age,num,add,sal);
        this.specialization=specialization;
    }
    void printDetails(){
        System.out.println("Name of Employee:"+ name);
        System.out.println("Age of Employee:"+ age);
        System.out.println("Address of Employee:"+ add);
        System.out.println("Number of Employee:"+ num);
        System.out.println("salary of Employee:"+ sal);
        System.out.println("specialization of Employee:"+ specialization);
    }
}
class Manager extends member{
    private String department;
    Manager(String name, int age, long num, String add, float sal, String department){
        super(name,age,num,add,sal);
        this.department=department;
    }
        void printDetails(){
        System.out.println("Name of Employee:"+ name);
        System.out.println("Age of Employee:"+ age);
        System.out.println("Address of Employee:"+ add);
        System.out.println("Number of Employee:"+ num);
        System.out.println("salary of Employee:"+ sal);
        System.out.println("department of Employee:"+ department);
        }

}

public class Practical_18 {
    public static void main(String[] args) {
        Employee e =new Employee("Dhyan",19,932,"India",100,"AIML");
        Manager m =new Manager("Dhairaya",19,123,"India",100,"web");
        e.printDetails();
        System.out.println("-----------------------------------");
        m.printDetails();
    }
}