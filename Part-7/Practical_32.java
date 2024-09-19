class   thread1 extends Thread{
    public void run(){
        System.out.println("Hello world from Thread from Extends Method!!!");
    }
}
class thread2 implements Runnable{
    public void run(){
        System.out.println("Hello world from Thread from Runnable Mehtod!!!");
    }
}
class Practical_32 
 {
    public static void main(String[] args) {
        thread1 t1=new thread1();
        t1.start();
        Thread t2=new Thread(new thread2());
        t2.start();
    }
    
}
