package JavaKodnest;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number:");
        int x= sc.nextInt();
        if(x%2==0){
            System.out.println("x :"+x+" even number");
        }
        else{
            System.out.println("x:"+x+" odd number");
        }

    }
}
