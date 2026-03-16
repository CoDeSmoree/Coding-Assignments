package Module5;
//Create a custom exception using throw and throws keywords.

class PassOrFail extends Exception{
    public PassOrFail(String m){
        super(m);
    }
}
public class CustomException {
    public static void check(int marks) throws PassOrFail{
            if(marks<30){
                throw new PassOrFail("Marks must be above 30");
            }
        System.out.println("passed");
    }
    public static void main(String[] args) {
        try{
            check(30);
        }
        catch(PassOrFail e){
            System.out.println("Caught: "+e.getMessage());
        }

    }
}
