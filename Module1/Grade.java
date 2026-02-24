package Module1;
//3 Write a program that takes a student's marks as input and prints the corresponding
// grade (A, B, C, D, or F) using a switch statement.
import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        System.out.print("Enter the marks: ");
        Scanner scan= new Scanner(System.in);
        int m= scan.nextInt();
        m%=10;
        char grades=' ';
        switch (m)
        {
            case 10:
            case 9:
            case 8:
                grades='A';
                break;
            case 7:
            case 6:
                grades='B';
                break;
            case 5:
            case 4:
                grades='C';
                break;
            case 3:
            case 2:
                grades='D';
                break;
            case 1:
            case 0:
                grades='F';
                break;
            default:
                System.out.println("Enter correct marks");
        }
        System.out.println("The grade is: "+grades);
    }
}
