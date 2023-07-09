package JavaKodnest;

import java.util.Scanner;

public  class PrimeApp{
    public  static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the given number:");
        int a=sc.nextInt();
        Prime p=new Prime();
        boolean res=p.primeNum(a);
        if(res==true) {
            System.out.println("the number a= " + a+"is  prime");
        }
        else{
            System.out.println("the number a= "+a+"  not prime");
        }
    }
}
 class Prime {
    boolean primeNum(int n){
        if(n==0 || n==1){
            return false;
        }
        else if(n==2){
            return true;
        }
        else{
            for(int i=2;i<=n;i++){
                if(n%i==0){
                    return false;
                }
            }
            return true;
        }
    }
}
