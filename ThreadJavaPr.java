class Animal implements Runnable{
    String name;
    String attack;

    Animal(String name, String attack){
        this.name = name ;
        this.attack = attack;
    }

    @Override
    public void run(){
        for(int i=0; i<5; i++){
            synchronized(Animal.class){
                System.out.println(name+ "used" + attack);
                try{
                    Thread.sleep(1000);
                    Animal.class.notify();
                    if(i<4){
                        Animal.class.wait();
                    }
                }
                catch(InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}



public class ThreadJavaPr {
    public static void main(String args[]){
        Animal dog = new Animal("Dog","Bite");
        Animal bird = new Animal("bird","flying");
        
        Thread t1 = new Thread(dog);
        Thread t2 = new Thread(bird);

        t1.start();
        t2.start();
    }
}
