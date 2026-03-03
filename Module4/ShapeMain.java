package Module4;
// Create an abstract class Shape with an abstract method area(). Implement it in Circle
//and Rectangle classes.
abstract class Shape{
    public abstract double area();
}
class Circle extends Shape{
    double r;
    Circle(double r){
        this.r=r;
    }
    public double area(){
        return 3.14*r*r;
    }
}
class Rectangle extends Shape{
    double l; double h;
    Rectangle(double l, double h){
        this.l=l;
        this.h=h;
    }
    public double area(){
        return l*h;
    }
}
public class ShapeMain {
    public static void main(String[] args) {
        Shape c=new Circle(7.5);
        Shape rec=new Rectangle(5.4,8.3);
        System.out.println("Area of Circle: "+c.area());
        double reca=rec.area();
        System.out.format("Area of Rectangle: %.3f",reca);
    }
}
