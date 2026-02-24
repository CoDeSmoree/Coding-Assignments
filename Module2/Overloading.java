package Module2;
//Write a program to demonstrate method overloading by creating multiple methods with
//the same name but different parameters.
public class Overloading {
    static void add(int a, int b){
        System.out.println(a+b);
    }
    static void add(double a, double b){
        System.out.println(a+b);
    }
    static void mult(double a, int b, int c){
        System.out.println(a*b*c);
    }
    static void mult(double a, double b){
        System.out.println(a*b);
    }

    public static void main(String[] args) {
        add(5.0,7.7);
        add(6,7);
        mult(8.9,2);
        mult(4.5,7,5);

    }
}
