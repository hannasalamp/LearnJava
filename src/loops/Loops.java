package loops;


import java.util.Scanner;

public class Loops {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Ënter the limit: ");
        int x=scanner.nextInt();
        for(int i=0;i<x;i++){
            System.out.println(i);
        }
    }
}
