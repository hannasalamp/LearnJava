package JavaKodnest;

public class BaseString {
    public  static void main(String[] args) {
        String s1 = new String("java");
        System.out.println("si: " + s1);
        String s2 = "html";
        System.out.println("s2 " + s2);
        char ch[] = {'p', 'y', 't', 'h', 'o', 'n'};
        String s3=new String(ch);
        System.out.println("s3: "+s3);
        String s4= "html";
        System.out.println(s2==s4);
        System.out.println(s1==s4);
    }
}
