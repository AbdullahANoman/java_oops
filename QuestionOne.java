class Fighter{
    String name;
    int powerLevel;

    Fighter(String name, int powerLevel){
        this.name = name;
        this.powerLevel = powerLevel;
    }
    public void attack(){
        System.out.println("Launching Basic Attack");
    }
}

class Saiyan extends Fighter {
    int transformationLevel;

    Saiyan(String name , int powerLevel, int transformationLevel){
        super(name,powerLevel);
        this.transformationLevel = transformationLevel;
    }
    @Override
    public void attack(){
        System.out.println("Super Saiyan attack with power "+powerLevel);
    }
}

class Namekian extends  Fighter{
    int regenerationRate;
    
    Namekian(String name , int powerLevel, int regenerationRate){
        super(name,powerLevel);
        this.regenerationRate = regenerationRate;
    }
    @Override
    public void attack(){
        System.out.println("Namekian attack with healing bonus!");
    }
}



public class QuestionOne {
    public static void main(String args[]){
        Saiyan s1 = new Saiyan("Noman",1000, 2);
        Namekian n1 = new Namekian ("Akash",500, 4);

        s1.attack();
        n1.attack();
    }
}
