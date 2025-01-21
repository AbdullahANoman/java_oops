class Vector3D {
    private double x, y, z;
    
    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector3D add(Vector3D other) {
        return new Vector3D(this.x + other.x, this.y + other.y, this.z + other.z);
    }

    public void display() {
        System.out.println("Vector: (" + x + ", " + y + ", " + z + ")");
    }
}

public class Lab_Four_Task_One {
    public static void main(String args[]){
        Vector3D vector1 = new Vector3D(1.0, 2.0, 3.0);
        Vector3D vector2 = new Vector3D(4.0, 5.0, 6.0);
        System.out.println("Original Vectors:");
        vector1.display();
        vector2.display();
        Vector3D result = vector1.add(vector2);
        System.out.println("Result of Vector Addition:");
        result.display();
    }
}
