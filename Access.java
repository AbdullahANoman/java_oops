class Account {
    public String name ;
    protected double balance;
    private String password;

    Account(String password){
        this.password = password;
    }
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.balance);
    }
    private void setPassword(String password){
        this.password = password;
    }
    public String getPassword(){
        setPassword("ami password");
        return this.password;
    }
}



public class Access {
    public static void main (String args[]){
        Account a1 = new Account("dfjngjdnb");
        a1.name = "Noman";
        a1.balance = 1000.237;
        
        System.out.println(a1.getPassword());
        a1.printInfo();
    }
}
