package JavaKodnest;

public class MethodsOfString {
    public static void main(String[] args){
        String str= "Kodnest Tech";
        int l= str.length();
        boolean pr= str.contains("T");
        char ch[] =str.toCharArray();
        String s[] =str.split(" ");
        String str2= str.concat(" Software");
        System.out.println("orginal string is:"+str);
        System.out.println("length of the string is:"+l);
        System.out.println("is given character present in the string:"+pr);
        System.out.println("print element of arrray ch: ");
        for(int i=0;i<ch.length; i++) {
            System.out.println(ch[i]);
        }
        System.out.println();
        System.out.println("printing element of array s:");
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
        System.out.println("concatenated string:"+str2);
    }
}
