import java.util.Random;
class thread1 extends Thread{
    int num;
    int i=0;
    Random rand=new Random();
    public void run(){
        while(i !=10){
            num=rand.nextInt();
            System.out.println("The number is " + num);
            if(num%2==0){
                new thread2(num).start();
            }
            else if (num%2!=0) {
                new thread3(num).start();
            }
            else if(num<0){
                System.out.println("negative number!!!");
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            i++;
        }

    }
}
class thread2 extends Thread{
    int num;
    thread2(int num){
        this.num=num;
    }
    public void run(){

        System.out.println("The square is "+ num*num);
    }
}
class thread3 extends Thread{
    int num;
    thread3(int num){
        this.num=num;
    }
    public void run(){
        System.out.println("The cube is "+ num*num*num);
        
    }
}
class Practical_34{
    public static void main(String[] args) {
        thread1 t1=new thread1();
        t1.start();
    }
}
