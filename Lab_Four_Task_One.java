class Vector3D {
    private double x, y, z;
    
    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    //NOTE other refers to the second vector object that is passed as an argument when calling the add method.
    public Vector3D add(Vector3D other) {
        return new Vector3D(this.x + other.x, this.y + other.y, this.z + other.z);
    }

    public void display() {
        System.out.println("Sum: (" + x + ", " + y + ", " + z + ")");
    }
}

public class Lab_Four_Task_One {
    public static void main(String args[]){
        Vector3D v1 = new Vector3D(2.4, 7.1, 3.3);
        Vector3D v2 = new Vector3D(4.1, 5.2, 6.4);
        System.out.println("Original Vectors:");
        v1.display();
        v2.display();
        Vector3D result = v1.add(v2);
        System.out.println("Result of Vector Addition:");
        result.display();
    }
}
