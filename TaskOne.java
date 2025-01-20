class Calculate {
    void Sum() {
        System.out.println("Empty String");
    }

    int Sum(int a) {
        return a;
    }

    int Sum(int a, int b) {
        return a + b;
    }

    double Sum(double a, double b) {
        return a + b;
    }

    double Sum(int a, double b) {
        return a + b;
    }

    float Sum(float a, float b, float c) {
        return a + b + c;
    }

    //NOTE need to add a method in the Calculate class that handles three double argument.
    //NOTE do not call the float Sum function because the return type using return value.
    double Sum(double a, double b, double c) {
        return a + b + c;
    }
}

public class TaskOne {
    public static void main(String args[]) {
        Calculate calc = new Calculate();
        calc.Sum();
        System.out.println(calc.Sum(5));
        System.out.println(calc.Sum(5, 10));
        System.out.println(calc.Sum(5.5, 10.5));
        System.out.println(calc.Sum(5, 10.5));
        System.out.println(calc.Sum(2.3, 2.4, 2.5)); 
    }
}
