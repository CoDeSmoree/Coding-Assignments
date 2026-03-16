package Module5;
//Write a program that throws an exception if age is less than 18.

class Below18 extends Exception{
    public Below18(String m){
        super(m);
    }
}
public class MinorException {
    public static void exp( int age) throws Below18{
        if(age<18){
            throw new Below18("Still a minorr");
        }
        System.out.println("Enter valid age");
    }

    public static void main(String[] args) {
        try{
            exp(12);
        }
        catch(Below18 e){
            System.out.println(e.getMessage());
        }

    }
}
