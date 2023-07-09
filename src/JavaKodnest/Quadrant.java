package JavaKodnest;

import java.util.Scanner;

public class Quadrant {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the number x and y:");
        int x= sc.nextInt();
        int y=sc.nextInt();
        if(x>0&&y>0) {
            System.out.println("the point is lie in 1st quadrant ");
        }
            else if(x<0&&y>0){
                System.out.println("the point lie in 2nd quadrant");
            }
            else if(x<0&&y<0){
                System.out.println("the point lie in 3rd quadrant");
            }
            else if(x>0&&y<0) {
                System.out.println("the point lies in 4th quadrant");
            }
            else if(x!=0&&y==0){
                System.out.println("the point lies in x-axis");
            }
            else if(y!=0&&x==0){
                System.out.println("the point lies in y-axis");
            }
            else if(x==0&&y==0){
                System.out.println("the point lies at origin");
            }

    }
}
