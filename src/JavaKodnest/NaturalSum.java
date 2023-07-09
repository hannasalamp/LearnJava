package JavaKodnest;

import java.util.Scanner;

public class NaturalSum {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the number:");
        int n=sc.nextInt();
        NumberSum s=new NumberSum();
        s.sumNaturalNumber(n);
    }
}
