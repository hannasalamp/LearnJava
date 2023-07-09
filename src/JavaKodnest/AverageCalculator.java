package JavaKodnest;

import java.util.Scanner;

public class AverageCalculator {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter three numbers:");
        int n1= scan.nextInt();
        int n2= scan.nextInt();
        int n3= scan.nextInt();
        int sum=n1+n2+n3;
        int avg=sum/3;
        System.out.println("The Average of Three Numbers: "+avg);

    }
}
