package Module1;
//Write a program to check if a number is prime or not.
import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner scan= new Scanner(System.in);
        int n= scan.nextInt();
        int c=0;
        for(int i=1;i<=n;i++){
            if(n%i==0) c++;
        }
        if(c==2){
            System.out.println(n+" is a Prime Number");
        }
        else{
            System.out.println(n+" is not a Prime Number");
        }
    }
}
