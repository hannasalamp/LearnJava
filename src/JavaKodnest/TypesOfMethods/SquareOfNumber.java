package JavaKodnest.TypesOfMethods;

public class SquareOfNumber {
    //return type void argument nil
    public void fSquare(){
        int num = 20;
        int square = num*num;
        System.out.println(square);
    }

    //return void argument num
    public void fSquare(int num){
        int square = num*num;
        System.out.println(square);
    }

    //return type int argument int
    public int fsquare(int num){
        int square = num*num;
        return square;
    }

    //return int argument nil
    public int fiSquare(){
        int num = 20;
        int square = num*num;
        return square;
    }
}
