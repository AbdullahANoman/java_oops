// Question 3: Threading – Pokémon Battle Arena

// You are implementing a Pokémon battle arena where Pokémon take turns attacking. Write pseudocode to
// demonstrate threading:

// Create a class Pokemon that implements Runnable.
// Fields: name (String), attack (String).
// The run() method should print "Pokemon {name} uses {attack}!" three times, with a 1-second delay between
// each attack.
// Create threads for two Pokémon:
// Pikachu using "Thunderbolt"
// Charizard using "Flamethrower"
// Start both threads and depict how they alternate attacks.


class Pokemon implements Runnable {
    String name;
    String attack;


    Pokemon(String name, String attack) {
        this.name = name;
        this.attack = attack;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) { 
            synchronized (Pokemon.class) {
                System.out.println("Pokemon " + name + " uses " + attack + "!");
                try {
                    Thread.sleep(1000); 
                    Pokemon.class.notify(); 
                    if (i < 2) { 
                        Pokemon.class.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class QuestionThree {
    public static void main(String[] args) {

        Pokemon pikachu = new Pokemon("Pikachu", "Thunderbolt");
        Pokemon charizard = new Pokemon("Charizard", "Flamethrower");

        Thread t1 = new Thread(pikachu);
        Thread t2 = new Thread(charizard);

        t1.start();
        t2.start();
    }
}