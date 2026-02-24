package Module1;
//Write a program to find the sum of all even numbers between 1 and 100 using a while loop
public class EvenNum {
    public static void main(String[] args) {
        int sum=0;
        int c=0;
        while(c<101){
            sum=sum+c;
            c+=2;
        }
        System.out.println("The sum of all even numbers from 1 to 100 is "+sum);
    }
}
