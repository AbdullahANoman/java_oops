abstract  class Animal{
    abstract void walk();
    public void eat(){
        System.out.println("Animal is eating");
    }
}


class Dog extends Animal {
    public void walk(){
        System.out.println("Dog is walking with 4 legs");
    }
}

class Chicken extends Animal {
    public void walk(){
        System.out.println("Chicken is walking with 2 legs");
    }
}



public class Abstract {
    public static void main (String args[]){
        Dog myDog = new Dog();
        Chicken myChicken = new Chicken();
        myDog.walk();
        myChicken.walk();
        myChicken.eat();
    }
}
