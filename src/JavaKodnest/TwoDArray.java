package JavaKodnest;

import java.util.Scanner;

public class TwoDArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter the number of row:");
        int row=sc.nextInt();
        System.out.println("please enter the column:");
        int col=sc.nextInt();
        sc.nextLine();
        String name[][]=new String[row][col];
        System.out.println("please enter the name:");
        for(int i=0;i<name.length;i++ ){
            for(int j=0;j<name[i].length;j++){
                name[i][j]=sc.nextLine();
            }
        }
        System.out.print("name of the students:");
        for(int i=0;i<name.length;i++ ){
            for(int j=0;j<name[i].length;j++){
                System.out.print(name[i][j]+" ");
            }
            System.out.println();
        }
    }
}
