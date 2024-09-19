import java.lang.*;

public class Practical_20 {
    public static void main(String[] args) {
        square obj = new square(); // Ensure this line matches
        obj.printr(); // Calls the method from the rectangle class
        obj.prints(); // Calls the method from the shape class
        obj.printsq(); // Calls the method from the square class
    }
}

class shape {
    void prints() {
        System.out.println("This is shape");
    }
}

class rectangle extends shape {
    void printr() {
        System.out.println("This is rectangle");
    }
}

class square extends rectangle {
    // No-argument constructor (implicitly provided by Java if none is defined)
    // Optionally, you can define it explicitly
    public square() {
        // Implicit call to super() here, calling the default constructor of rectangle
    }

    void printsq() {
        System.out.println("Square is a rectangle");
    }
}

class circle extends shape {
    void printc() {
        System.out.println("This is circular shape");
    }
}
