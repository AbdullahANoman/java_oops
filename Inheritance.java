//NOTE this is the inheritance example


class Shape {
    int length, width;
    int radius;
}

class Triangle extends Shape {
    public void area(){
        System.out.println(0.5*(length*width));
    }
}

class Circle extends Shape {
    public void area (){
        System.out.println(3.14*radius*radius);
    }
}




public class Inheritance {
    public static void main(String args[]){
        Triangle t1 = new Triangle();
        Circle c1 = new Circle();
        t1.length = 10;
        t1.width = 200;
        c1.radius = 10;
        t1.area();
        c1.area();
    }
}
