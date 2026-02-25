package Module3;
// Write a program to demonstrate the difference between method overloading and
//method overriding
public class Methods {
    void add(int a, int b){
        System.out.println("Sum of two numbers: "+(a+b));
    }
    void add(int a, int b, int c){
        System.out.println("Sum of three numbers: "+(a+b+c));
    }
    void add(double a, double b){
        System.out.println("Sum of two numbers: "+(a+b));
    }
    void add(char c1, char c2){
        System.out.println("Merged characters: "+c2+c1);
    }
    void add(String s1, String s2){
        System.out.println("Concatenated Strings: "+s2+s1);
    }
}
class Merge extends Methods {
    @Override
    void add(char c1, char c2){
        System.out.println("Merged characters: "+c1+c2);
    }
}
class Concatenate extends Methods{
    @Override
    void add(String s1, String s2){
        System.out.println("Concatenated Strings: "+s1+s2);
    }
}
class Demo{
    public static void main(String[] args) {
        Methods overload = new Methods();
        overload.add(9.6, 2.4);
        overload.add(77, 55,99);
        Methods override1=new Merge();
        overload.add('c','5');
        override1.add('c','5');
        Methods override2= new Concatenate();
        override2.add("1st","2nd");
        overload.add("1st","2nd");

    }

}