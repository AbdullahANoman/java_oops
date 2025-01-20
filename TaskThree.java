class Course {
    void course_details() {
        System.out.println("We are learning multiple courses of CSE this semester.");
    }
}

class Discrete_Mathematics extends Course {
    @Override
    void course_details() {
        System.out.println("We are learning multiple chapters of discrete mathematics this semester.");
    }
}

class C_Plus_Plus extends Course {
    @Override
    void course_details() {
        System.out.println("We are learning various applications of C++ this semester.");
    }
}

public class TaskThree {
    public static void main(String[] args) {
        Course c1 = new Course();
        Course d1 = new Discrete_Mathematics();
        Course cp1 = new C_Plus_Plus();

        //NOTE Calling course_details() on each object
        c1.course_details(); 
        d1.course_details(); 
        cp1.course_details(); 
    }
}
