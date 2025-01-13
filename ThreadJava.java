class Pokemon implements Runnable{
    String name;
    String attack;
   
    Pokemon(String name, String attack){
        this.name = name;
        this.attack = attack;
    }
   
    @Override
    public void run(){
        for(int i=0; i<5; i++){
            synchronized(Pokemon.class){
                System.out.println(name+" used "+attack);
                try{
                    Thread.sleep(1000);
                    Pokemon.class.notify();
                    if(i<4){
                        Pokemon.class.wait();
                    }
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}

public  class ThreadJava {
    public static void main(String args[]) {

        Pokemon pika = new Pokemon("Pikachu", "Thunderbolt");
        Pokemon zard = new Pokemon("Charizard", "Flamethrower");
       
       
        Thread t1 = new Thread(pika);
        Thread t2 = new Thread(zard);
       
        t1.start();
        t2.start();
    }
}