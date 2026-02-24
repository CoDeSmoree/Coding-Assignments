package Module2;
//Write a program with a method that calculates the factorial of a number using
//recursion.
import java.util.Scanner;

public class Factorial {
    static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner scan= new Scanner(System.in);
        int n= scan.nextInt();
        System.out.println("The factorial of "+n+" is "+fact(n));
    }
}
