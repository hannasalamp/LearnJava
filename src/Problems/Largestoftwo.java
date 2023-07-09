package Problems;

import java.util.Scanner;

public class Largestoftwo {
    public static void main (String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int lar=largest(a,b);
        System.out.println("largest of "+a+","+b+":"+lar);


    }
    private static int largest(int x, int y){
        if(x>y){
            return x;
        }
        else{
            return  y;
        }




    }


}
