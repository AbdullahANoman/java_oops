class Wizard {
    String name;
    String house ;
    Wizard(String name , String house){
        this.name = name ;
        this.house = house ;
    }

    public void duel(){
        System.out.println("Basic duel spell from "+house);
    }
}


class GryffindorWizard extends Wizard {
    GryffindorWizard(String name, String house){
        super(name,house);
    }
    @Override
    public void duel (){
        System.out.println("Casting Expelliarmus with courage!");
    }
}

class SlytherinWizard extends Wizard {
    SlytherinWizard(String name, String house){
        super(name,house);
    }
    @Override
    public void duel (){
        System.out.println("Casting Sectumsempra with cunning!");
    }
}


public class QuestionTwo {
    public static void main(String args[]){
        GryffindorWizard gWizard = new GryffindorWizard("Noman","Nikunjo-2");
        SlytherinWizard sWizard  = new SlytherinWizard("Moinul","Mirpur-10");

        gWizard.duel();
        sWizard.duel();
    }
}
