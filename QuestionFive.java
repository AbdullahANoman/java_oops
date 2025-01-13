class Pokemon{
    public void battleCry(){
        System.out.println("Basic Pokémon cry!");
    }
}


class Pikachu extends Pokemon{
    @Override
    public void battleCry(){
        System.out.println("Pika Pika!");
    }
}

class Raichu extends Pokemon{
    @Override
    public void battleCry(){
        System.out.println("Rai Rai!");
    }
}


public class QuestionFive {
    public static void main (){
        Pokemon pokemon = new Pikachu();
        System.out.println("Before evolution:");
        pokemon.battleCry();  
        pokemon = new Raichu();
        System.out.println("After evolution:");
        pokemon.battleCry();
    }
}
