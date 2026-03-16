package Module5;
//Write a program to demonstrate checked and unchecked exceptions with examples.
import java.io.FileReader;
import java.io.FileNotFoundException;
class CheckedException{
    public static void check(){
        try {
            FileReader fr = new FileReader("file.txt");
        }
        catch(FileNotFoundException e) {
            System.out.println("Checked Exception: " + e);
        }
    }
}

class UnCheckedException{
    public static void uncheck(){
        int x=0;
        int y=10;
        System.out.println(y/x);
    }
}
public class Un_CheckedException {
    public static void main(String[] args) {
        CheckedException.check();
        UnCheckedException.uncheck();
    }

}
