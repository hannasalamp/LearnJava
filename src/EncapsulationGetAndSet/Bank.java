package EncapsulationGetAndSet;

public class Bank {
    private int amt=10000;
    int pin=1914;

    public void setAmt(int p,int a) {
        if(pin==p){
            amt=a;
        }
        else{
            System.out.println("invalid PIN");
            System.exit(0);
        }

    }
    public int getAmt(int p){
        if(pin!=p){
            System.out.println("invalid PIN");
            System.exit(0);
        }
        return amt;

    }
}
