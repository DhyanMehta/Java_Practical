class thread extends Thread{
    thread(String tname){
        super(tname);
    }
    public void run(){
        System.out.println("Name of the thread is "+ Thread.currentThread().getName());
        System.out.println("Priority of the thread is "+ Thread.currentThread().getPriority());
    }
}
public class Practical_36 {
    public static void main(String[] args) {
        thread First=new thread("First");
        thread Second=new thread("Second");
        thread Third=new thread("Third");
        First.setPriority(3);
        Second.setPriority(5);
        Third.setPriority(7);
        
    }
}
