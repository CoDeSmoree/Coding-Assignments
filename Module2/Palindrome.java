package Module2;

import java.util.Scanner;

//Write a program with a method that checks whether a given string is a palindrome.
public class Palindrome {
    static boolean pal(String s){
        s=s.toLowerCase();
        String og="";
        for(int i=s.length()-1;i>=0;i--){
            og=og+s.charAt(i);
        }
        if(og.equals(s)){
            return true;
        }
        return false;

    }
    public static void main(String[] args) {
        System.out.print("Enter the String: ");
        Scanner scan= new Scanner(System.in);
        String s= scan.nextLine();
        boolean b=pal(s);
        if(b){
            System.out.println("The String "+s+" is a Palindrome");
        }
        else System.out.println("The String "+s+" is not a Palindrome");
    }
}
