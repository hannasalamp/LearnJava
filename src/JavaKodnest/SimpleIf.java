package JavaKodnest;

import java.util.Scanner;

public class SimpleIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the key 1 by using keyboard:");
        int n = scan.nextInt();
        if (n == 1) {
            System.out.println("you are enter the right key");
        }
        System.out.println("you are not enter the right key");
    }
}