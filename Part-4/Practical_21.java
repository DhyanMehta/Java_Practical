 class Degree {
        void getDegree() {
           System.out.println("I got a degree");
       }
   }
   
    class Undergraduate extends Degree {
        void getDegree() {
           System.out.println("I am an Undergraduate");
       }
   }
   
    class Postgraduate extends Degree {
        void getDegree() {
           System.out.println("I am a Postgraduate");
       }
   }
   
    public class Practical_21 {
       public  static void main(String[] args) {
           Degree degree = new Degree();
           degree.getDegree(); 
   
           Undergraduate undergraduate = new Undergraduate();
           undergraduate.getDegree(); 
   
           Postgraduate postgraduate = new Postgraduate();
           postgraduate.getDegree(); 
   
}
    }
