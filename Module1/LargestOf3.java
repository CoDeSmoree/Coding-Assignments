package Module1;
//Write the program to find the largest of 3 numbers using if-else statements
import java.util.Scanner;

public class LargestOf3 {
    public static void main(String[] args) {
        System.out.print("Enter the numbers: ");
        Scanner scan= new Scanner(System.in);
        int n1= scan.nextInt();
        int n2= scan.nextInt();
        int n3= scan.nextInt();
        if(n1>n2 && n1>n3){
            System.out.println(n1+ " is the largest number");
        }
        else if(n2>n1 && n2>n3){
            System.out.println(n2+ " is the largest number");
        }
        else System.out.println(n3+" is the largest number");
    }
}
