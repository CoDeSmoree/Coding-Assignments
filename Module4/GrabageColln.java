package Module4;
//Write a short program to demonstrate Garbage Collection using System.gc().
public class GrabageColln {
    public static void main(String[] args) {
        for(int i=0;i<10;i++)
            System.out.println("Garbage");
        System.gc(); //requested for garbage collection
        System.out.println("GArbage Collected");
    }
}
