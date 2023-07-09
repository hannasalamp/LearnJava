package Problems;

import java.util.Scanner;

import static java.lang.Integer.sum;

public class Swapping {

    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Ënter first number: ");
        int a= scan.nextInt();
        System.out.println("Ënter second number: ");
        int b= scan.nextInt();
        swap(a,b);
    }
    private static void swap(int s,int h){
        System.out.println("Before swapping:"+s+","+h);
        s=s+h;
        h=s-h;
        s=s-h;
        System.out.println("after swapping:"+s+","+h);

    }
}
