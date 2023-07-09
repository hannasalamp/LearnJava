package EncapsulationGetAndSet;

public class Shamil {
    public static void main(String[] args){
        Bank b=new Bank();
        int p=3425;
        b.setAmt(p,5679);
        int a= b.getAmt(p);
        System.out.println("Amount="+a);

    }
}
