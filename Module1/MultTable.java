package Module1;
// Write a program to print the multiplication table of a given number using a for loop.
import java.util.Scanner;

public class MultTable {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner scan= new Scanner(System.in);
        int n= scan.nextInt();
        for(int i= 1;i<=10;i++)
            System.out.println(n+"*"+i+"="+(n*i));
    }
}
