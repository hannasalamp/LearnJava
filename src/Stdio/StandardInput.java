package Stdio;

import java.util.Scanner;

public class StandardInput {
//    public void standardInput(){
//
//    }
    public static void  main(String[] args){
        //Create an Object of Scanner class to take input fron the console/ keuboard
        //Object obj = new Object();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ënter first number :");
        int a = scanner.nextInt();
        System.out.println("Ënter second number :");
        int b = scanner.nextInt();
        int sum = a+b;
        System.out.println("Print sum "+sum);
    }
}
