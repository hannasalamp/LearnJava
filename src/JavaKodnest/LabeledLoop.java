package JavaKodnest;

public class LabeledLoop {
    public static void main(String[]  args){
        outer:for(int i=1;i<=3;i++){
            System.out.println(i);
            inner:for(int j=0;j<=2;j++){
                System.out.println("Kodnest");
                break outer;
            }
        }

    }
}
