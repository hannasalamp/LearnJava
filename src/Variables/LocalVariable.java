package Variables;

public class LocalVariable {
   static int a=4;
    public static void main(String[] args){
     for (int i=1;i<=10;i++) {
         int num=i;
         System.out.println(num);
     }
        System.out.println(a);
     //LocalVariable locvar=new LocalVariable();
     //System.out.println(locvar.a);
    }
}
