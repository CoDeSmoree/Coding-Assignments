package Module1;
//Write a program to check if the given number is positive,negative or zero
import java.util.Scanner;
public class PosOrNeg {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner scan= new Scanner(System.in);
        int n= scan.nextInt();
        if(n>0) System.out.println(n+" is a positive number");
        else if(n<0) System.out.println(n+" is a negative number");
        else System.out.println("The number is zero");
    }

}
