package Module4;
//5 Demonstrate the use of final keyword with variables, methods, and classes.

class FinalParent{
    final void print(){
        System.out.println("Hello world");
    }
}

class Finalchild extends FinalParent{
   /* void print(){
        System.out.println("Bye World");
    }*/
}
class FinalWStatic{
    static final String COLLEGE= "Sapthagiri";
}

final class FinalClass{
    public static String s;
    FinalClass(String s){
        this.s=s;
    }
    void display(){
        System.out.println("Value of String: "+s);
    }
}
public class FinalKW {
    public static void main(String[] args) {
        //final method: here final methods cannot be overridden and the print() method in the child class gives an error
        FinalParent fp= new Finalchild();
        fp.print();

        final int x=10;
        //x+=9; gives an error as final variables cannot be updated
        System.out.println("Value of final Variable: "+x);

        //final with static keyword
        System.out.println(FinalWStatic.COLLEGE);

        //final class: cannot be extended
        FinalClass finalobj= new FinalClass("Bye world..T_T");
        finalobj.display();
    }
}
