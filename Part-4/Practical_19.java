import java.util.*;

public class Practical_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count1 = 0, count2 = 0, choice;
        float length, breadth;
        // Use the correct class names for arrays
        square[] Square = new square[100];
        rectangle[] Rectangle = new rectangle[100];

        System.out.println("1) Rectangle \n2) Square");
        System.out.println("Enter your choice : ");
        choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter length and breadth of rectangle : ");
                length = sc.nextFloat();
                breadth = sc.nextFloat();
                // Create a new rectangle object and store it in the array
                Rectangle[count1] = new rectangle(length, breadth);
                Rectangle[count1].area(length, breadth);
                Rectangle[count1].perimeter(length, breadth);
                count1++;
                break;
            case 2:
                System.out.println("Enter side length of the square : ");
                length = sc.nextFloat();
                // Create a new square object and store it in the array
                Square[count2] = new square(length);
                Square[count2].area(length);
                Square[count2].perimeter(length);
                count2++;
                break;
            default:
                System.out.println("Enter a valid choice!!!");
                break;
        }

        sc.close();
    }
}

class rectangle {
    protected float length, breadth;

    public rectangle(float l, float b) {
        length = l;
        breadth = b;
    }

    void area(float l, float b) {
        System.out.println("The area of the rectangle is : " + l * b);
    }

    void perimeter(float l, float b) {
        System.out.println("The perimeter of the rectangle is : " + 2 * (l + b));
    }
}

class square extends rectangle {
    public square(float s) {
        super(s, s);
    }

    void area(float l) {
        System.out.println("The area of the square is : " + l * l);
    }

    void perimeter(float l) {
        System.out.println("The perimeter of the square is : " + 4 * l);
    }
}
