
class Shape {

    public double calculateArea() {
        System.out.println("Area calculation is undefined for generic Shape.");
        return 0;
    }
}

class Circle extends Shape {

    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {

    private double length, width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class Lab_Four_Task_Two {

    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        System.out.println("Area of Circle: " + circle.calculateArea());

        Shape rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());

        Shape shape = new Shape();
        System.out.println("Area of Shape: " + shape.calculateArea());
    }
}
