class Calculate {
    void Sum() {
        System.out.println("None");
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
}

public class TaskOne{
        public static void main(String args[]) {
            Calculate calc = new Calculate();
            calc.Sum();
            System.out.println(calc.Sum(5));
            System.out.println(calc.Sum(5, 10));
            System.out.println(calc.Sum(5.5, 10.5));
            System.out.println(calc.Sum(5, 10.5));
        }
}