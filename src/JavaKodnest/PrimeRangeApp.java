package JavaKodnest;

import java.util.Scanner;

public class PrimeRangeApp {
    public  static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter two number to find out how many numbers are prime in B/w them:");
    int a=sc.nextInt();
    int b=sc.nextInt();
    PrimeCheck p=new PrimeCheck();
    for (int i=a;i<=b;i++) {
        boolean res = p.primeNum(i);
        if (res==true ) {
            System.out.println(i);
        }
    }
  }
}
class PrimeCheck {
    boolean primeNum(int n) {
        if (n == 0 || n == 1) {
            return false;
        } else if (n == 2) {
            return true;
        } else {
            for (int i = 2; i <= n; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}