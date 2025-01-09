interface Animal{
    void walk();
    void eat();
}

interface FourLeggedAnimal {
  
}


//NOTE interface have possible to implement or extends two interface class at a time 
class Dog implements Animal, FourLeggedAnimal {
    public void walk(){
        System.out.println("Dog is walking with 4 legs");
    }
    public void eat(){
        System.out.println("Dog is eating");
    }
    
}




public class Interface {
    public static void main (String args[]){
            Dog d1 = new Dog();
            d1.walk();
    }
}
