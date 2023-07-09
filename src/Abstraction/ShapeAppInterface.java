package Abstraction;

public class ShapeAppInterface {
    public static void main(String[] args) {
        Squares sq = new Squares();
        Rectangles re = new Rectangles();
        circles ci = new circles();
        fun(sq);
        fun(re);
        fun(ci);
    }
    public static void fun(Shapes  s) {
        s.findArea();
        s.display();
    }
}
  interface Shapes {
     void findArea();
     void display();

}
class Squares implements Shapes {
   public void findArea(){
        int e=8;
        int area=e*e;
        System.out.println("the area of the square is:"+area);
    }
   public void display(){
        System.out.println("it is the square shape");
    }

}
class Rectangles implements Shapes {
    public void findArea(){
        int l=9;
        int b=10;
        int area=l*b;
        System.out.println("the area of the rectangle is:"+area);
    }
   public void display(){
        System.out.println("it is the rectangle shape");
    }

}
class circles implements Shapes {
   public void findArea(){
        double pi=3.14;
        int r=5;
        double area=pi*r*r;
        System.out.println("the area of the circle is:"+area);
    }
   public void display(){
        System.out.println("it is the circle shape");
    }

}

