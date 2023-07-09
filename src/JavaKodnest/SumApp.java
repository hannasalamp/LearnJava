package JavaKodnest;

public class SumApp {
    public  static  void main(String[] args){
        Sum sc=new Sum();
        sc.add();
        sc.sub(30,10);
        int res=sc.mul();
        System.out.println(res);
        int result=sc.div(30,6);
        System.out.println(result);
    }
}
