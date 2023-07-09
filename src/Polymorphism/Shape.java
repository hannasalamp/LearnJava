package Polymorphism;

public class Shape {
    void findArea(){
    }
    void display(){
    }
}
 class Square extends Shape{
    void findArea(){
        int e=5;
        int area=e*e;
        System.out.println("the area of the square is:"+area);
    }
    void display(){
        System.out.println("it is the square shape");
    }

}
class Rectangle extends Shape{
    void findArea(){
        int l=5;
        int b=6;
        int area=l*b;
        System.out.println("the area of the rectangle is:"+area);
    }
    void display(){
        System.out.println("it is the rectangle shape");
    }

}
class circle extends Shape{
    void findArea(){
        double pi=3.14;
        int r=6;
        double area=pi*r*r;
        System.out.println("the area of the circle is:"+area);
    }
    void display(){
        System.out.println("it is the circle shape");
    }

}
