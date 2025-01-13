abstract class Superhero {
    String name;
    String power;

    // Constructor
    Superhero(String name, String power) {
        this.name = name;
        this.power = power;
    }

    // Abstract method
    public abstract void usePower();
}

class  Batman extends  Superhero{
    Batman(String name , String power){
        super(name, power);
    }
    @Override
    public void usePower() {
        System.out.println("Using intellect and gadgets!");
    }
}

class Superman extends Superhero {
    Superman(String name, String power) {
        super(name, power);
    }

    @Override
    public void usePower() {
        System.out.println("Using super strength and heat vision!");
    }
}

public class QuestionFour {
    public static  void main (String args[]){
        Superhero batman = new Batman("Akash", "Gadget Power");
        Superhero superman = new Superman("Solaiman", "Super Power");
        batman.usePower();  
        superman.usePower(); 
    }
}
