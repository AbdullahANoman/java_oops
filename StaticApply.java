class Student {
    String name;
    static String school;
    public static void printInfo(){
       school = "Northern University Bangladesh";
    }
}

public class StaticApply {
    public static void main(String args[]){
        Student.school = "Daffodil International University";
        Student s1 = new Student();
        s1.name = "Abdullah Al Noman";
        System.out.println(s1.school);
    }
}
