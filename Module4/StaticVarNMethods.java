package Module4;
//Write a program to demonstrate static variables and static methods.
class StaticDemo{
    static String clgName="Sap"; //STaic variable is shared by all objects
    int usn;
    String name;
    StaticDemo(int usn, String name){
        this.usn=usn;
        this.name=name;
    }
    void display(){
        System.out.println("usn: "+usn+"\nname: "+name+"\nCollege: "+clgName);
    }
    //Static methods belong to class and not to the object
    static void change(){

        clgName="IIT";
        System.out.println("\n\nCollege Changed!! \nCollge: "+clgName);
    }
}
public class StaticVarNMethods {
    public static void main(String[] args) {
        //we use objects to invoke non static variables and methods
        StaticDemo s1= new StaticDemo(5,"Anmol");
        StaticDemo s2= new StaticDemo(14,"Anirudh");
        s2.display();
        s1.display();
        //calling static method using class name
        StaticDemo.change();
        s1.display();

    }
}
