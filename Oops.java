

// class Pen {
//     String color;
//     String type;

//     public void write(){
//         System.out.println("Write something");
//     }
//     public void printColor(){
//         System.out.println(this.color);
//     }
//     public void printType() {
//         System.out.println(this.type);
//     }
// }


class Student {
    String name ;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    //NOTE non-Parameterized constructor 
    // Student(){
    //     System.out.println("Constructor called");
    // }
    //NOTE parameterized constructor
    // Student(String name, int age){
    //     this.name = name ;
    //     this.age = age;
    // }
    //NOTE copy constructor 
    Student(Student s){
        this.name = s.name;
        this.age= s.age;
    }

    Student(){

    }

}

public class Oops {
    public static void main(String args[]){
        // NOTE non-Parameterized constructor 
            // Student s1 = new Student();
        //NOTE Parameterized constructor
        // Student s1 = new Student("Abdullah Al Noman", 21);
        // s1.printInfo();
        //NOTE copy constructor 
        Student s1 = new Student();
        s1.name = "Abdullah Al Noman";
        s1.age = 21;
        Student s2 = new Student(s1);
        s2.printInfo();
    }
}
