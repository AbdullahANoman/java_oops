class PlusOperator {
    int addNumber(int a, int b, int c){
        return a+b+c;
    }

    String concateWithString(String text){
        return "Northern University Bangladesh " +text ;
    }
}

public class TaskTwo {
    public static void main(String args[]){
            PlusOperator p1 = new PlusOperator();
            int sumOfThreeNumber = p1.addNumber(10, 20, 30);
            System.out.println("Sum of three numbers: " + sumOfThreeNumber);
            String result = p1.concateWithString("Additional text added");
            System.out.println(result);

    }
}
