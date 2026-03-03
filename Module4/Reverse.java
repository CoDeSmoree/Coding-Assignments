package Module4;
//Write a program to reverse a string using StringBuilder.
public class Reverse {
    public static void main(String[] args) {
        StringBuilder s= new StringBuilder();
        s.append("REversal");
        System.out.println("String before reversing: "+ s);
        s.reverse();
        System.out.println("String after reversing: "+s);
    }

}
