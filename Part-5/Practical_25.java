 class ExceptionExample {
    public static void main(String[] args) {
        try {
            int number = 10;
            int divisor = 0; 
            int result = number / divisor; 
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
   
            System.out.println("Exception caught: Division by zero is not allowed.");
        }

   
        System.out.println("Program continues after the try-catch block.");
    }
}
