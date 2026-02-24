package Module1;
//Write a program to print a pyramid pattern using nested loops for a given number of rows.
import java.util.Scanner;

public class Pyramid {
    static void mid(int r){
        for(int i=0;i<r;i++) {
            for (int j = 1; j <= r-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i+i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void left(int r){
        for(int i=0;i<r;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void right(int r){
        for(int i=1;i<=r;i++) {
            for (int j = 1; j <= r-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.print("\n 1.Pyramid \n 2.Left Pyramid \n 3.Right Pyramid \n Enter your choice: ");
        Scanner scan= new Scanner(System.in);
        int c= scan.nextInt();
        System.out.print("Enter the number of rows: ");
        int r=scan.nextInt();

        switch(c){
            case 1:
                mid(r);
                break;
            case 2:
                left(r);
                break;
            case 3:
                right(r);
                break;
            default:
                System.out.println("Enter a valid choice");
        }
    }
}
