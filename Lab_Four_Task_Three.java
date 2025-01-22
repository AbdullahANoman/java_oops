// Base class

class Shape {

    public void drawShape() {
        System.out.println("Drawing a generic shape.");
    }
}

class Circle extends Shape {

    @Override
    public void drawShape() {
        System.out.println("Drawing a Circle.");
    }
}

class Square extends Shape {

    @Override
    public void drawShape() {
        System.out.println("Drawing a Square.");
    }
}

public class Lab_Four_Task_Three {

    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.drawShape();

        Shape anotherShape = new Square();
        anotherShape.drawShape();
    }
}
