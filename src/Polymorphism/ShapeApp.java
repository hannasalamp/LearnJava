package Polymorphism;

public class ShapeApp {
    public static  void main(String[] args){
        Square sq=new Square();
        Rectangle re=new Rectangle();
        circle ci=new circle();
        fun(sq);
        fun(re);
        fun(ci);
    }
    public  static void fun(Shape s) {
        s.findArea();
        s.display();
    }
}
