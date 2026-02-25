package Module3;
//Write a program to demonstrate single inheritance with a base class Animal and
//derived class Dog.
public class Animal {
     static void sound(){
        System.out.println("Depends on the species");
    }
    static void food(){
        System.out.println("Both herbivore and Carnivore ");
    }
    static void habitat(){
        System.out.println("On land");
    }
}
class Dog extends Animal{

     static void sound(){
        System.out.println("Woof");
    }
    static void food(){
        System.out.println("Carnivore ");
    }
}
class Main{
    public static void main(String[] args) {
        Animal a= new Animal();
        Dog d= new Dog();
        d.food();
        a.food();
        a.sound();
        d.sound();
        d.habitat();
    }
}
