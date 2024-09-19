 interface Shape {
    String getColor();
    
    default String describe() {
        return "This is a shape with color " + getColor();
    }
}
 class Circle implements Shape {
    private double radius;
    private String color;

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    
    public String getColor() {
        return color;
    }

  
    public String describe() {
        return "This is a circle with radius " + radius + " and color " + color;
    }
}
 class Rectangle implements Shape {
    private double length;
    private double width;
    private String color;

    public Rectangle(double length, double width, String color) {
        this.length = length;
        this.width = width;
        this.color = color;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }


    public String getColor() {
        return color;
    }


    public String describe() {
        return "This is a rectangle with length " + length + ", width " + width + " and color " + color;
    }
}
 class Sign {
    private Shape shape;
    private String text;

    public Sign(Shape shape, String text) {
        this.shape = shape;
        this.text = text;
    }

    public void displaySign() {
        System.out.println(shape.describe() + ". Text on the sign: " + text);
    }
}
 class Practical_23 {
    public static void main(String[] args) {
        
        Circle circle = new Circle(5.0, "Red");

       
        Rectangle rectangle = new Rectangle(4.0, 6.0, "Blue");


        Sign circleSign = new Sign(circle, "Welcome to the Campus Center!");
        Sign rectangleSign = new Sign(rectangle, "Event Tonight at 8 PM!");


        circleSign.displaySign();
        rectangleSign.displaySign();
    }
}
