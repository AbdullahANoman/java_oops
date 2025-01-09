// NOTE Polymorphism has two types 1. Compile time polymorphism 2. Runtime polymorphism 
// PROBLEM 1: Compile time polymorphism has two type : 1.Method Overloading 2. Operator Overloading
// NOTE Now discuss about the method overloading


class Student {
    String name;
    int age;


    //NOTE same method name but different parameter that's called method overloading
    public void printInfo(String name) {
        System.out.println(name);
    }

    public void printInfo(int age) {
        System.out.println(age);
    }

    public void printInfo(String name, int age) {
        System.out.println(name + " " + age);
    }
    public void printInfo(){
        System.out.println("No parameter");
    }
}

public class MethodOverloading {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Abdullah Al Noman";
        s1.age = 21;
        // s1.printInfo(s1.name, s1.age);
        // s1.printInfo(s1.age);
        s1.printInfo();
    }
}

