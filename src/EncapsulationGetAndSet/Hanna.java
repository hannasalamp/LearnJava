package EncapsulationGetAndSet;

public class Hanna {
    public static void main(String[] args){
        Bank b=new Bank();
        int p=1914;
        b.setAmt(p,5000);
        int res=b.getAmt(p);
        System.out.println("Amount="+res);

    }

}
