package ConditionalStatement;

import java.util.Scanner;

public class Condition {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
   // if a number is even and it is divided by 2,then the remainder will be zero
        int rem= x%2;
        if(rem==0){
            System.out.println(x +"is even number");
        }
        else{
            System.out.println(x +"is odd number");
        }

    }

}
