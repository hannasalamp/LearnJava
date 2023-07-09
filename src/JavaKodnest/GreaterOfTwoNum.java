package JavaKodnest;

import java.util.Scanner;

public class GreaterOfTwoNum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers:");
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(x>y){
            System.out.println( "x :" + x +"is greater than y");
        }
        else{
            System.out.println("y:" +y+ " is greater");
        }
    }
}
