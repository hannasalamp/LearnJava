package JavaKodnest;

import java.util.Scanner;

public class ElseIfLadder {
    public  static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number in between 1-4:");
        int num= scan.nextInt();
        if(num==1) {
            System.out.println("you have entered 1");
        } else if(num==2){
            System.out.println("you have entered 2");
        }
         else if (num==3){
            System.out.println("you have entered 3");
        }
        else if(num==4) {
            System.out.println("you have entered 4");
        }
        else{
            System.out.println("please enter the number in proper way");
        }
    }
}
