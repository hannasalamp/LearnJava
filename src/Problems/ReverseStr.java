package Problems;

public class ReverseStr {
    public static void main(String[] args){
        String str="malayalam";
        String reverse="";
        int length=str.length();
        for(int i=0; i<length; i++) {
            reverse=str.charAt(i)+reverse;
        }
      System.out.println(reverse);
        if (str.equals(reverse)){
            System.out.println("it is pallindrome");

        }
        else {
            System.out.println("not pallindrome");
        }    }
}



