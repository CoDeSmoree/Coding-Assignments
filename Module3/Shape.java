package Module3;
//Write a program to demonstrate polymorphism using method overriding with a base
//class Shape and derived classes Circle and Rectangle.
public class Shape {
    static void area(double r){
        System.out.println("Area of circle: "+3.14*r*r);
    }
    static void area(double a, double b){
        System.out.println("Area of Rectangle: "+a*b);
    }
}
class Circle extends Shape{
   void circumference(double r){
        System.out.println("Circumference: "+2*3.14);
    }
}
class Rectangle extends Shape{
    void perimeter(double a, double b){
        System.out.println("Perimeter: "+2*(a+b));
    }
}
class MainShape {
    public static void main(String[] args) {
        Shape c = new Shape();
        Circle c1 = new Circle();
        c.area(5.9);
        c.area(8.8,6);
        c1.circumference(7);
        Rectangle r = new Rectangle();
        r.perimeter(9.7,4);

    }
}