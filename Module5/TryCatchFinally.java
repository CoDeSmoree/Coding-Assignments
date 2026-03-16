package Module5;
//Write a program using try-catch-finally to handle division by zero.
public class TryCatchFinally {
    public static void main(String[] args) {
        int x=10;
        int y=0;
        try{
            System.out.println(x/y);
        }
        catch(ArithmeticException e){
            System.out.println("Division not complete: "+e.getMessage());
        }
        finally{
            System.out.println("Divison example");
        }
    }
}
