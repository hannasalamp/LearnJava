package JavaKodnest;

import java.util.Scanner;

public class Addition {
    public static  void main(String[] args){
        Scanner scan=new Scanner(System.in);
       System.out.println("Enter two numbers:");
       int a=scan.nextInt();
       int b= scan.nextInt();
       int c=a+b;
       System.out.println("The result of addition of two numbers:"+c);
       int d=a*b;
        System.out.println("The result of multiplication of two numbers:"+d);
       int e=a-b;
        System.out.println("The result of substraction of two numbers:"+e);
       int f=a/b;
        System.out.println("The result of division of two numbers:"+f);
    }
}
