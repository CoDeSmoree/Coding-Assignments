package Module5;
//Create a thread using Thread class and another using Runnable interface. Compare
//both approaches.

class TThread extends Thread{
     @Override
    public void run(){
        System.out.println("Extending Threads");
    }

}
class Runnabble implements Runnable{
    public void run(){
        System.out.println("Implementing Runnable");
    }

}
public class ThreadvsRunnable {
    public static void main(String[] args) {


    TThread t1= new TThread();  //creating objec of thread class
    t1.start();
    Runnabble t2=new Runnabble(); //creation of runnable object
    Thread t3= new Thread(t2); //runnable object passed to a Thread object while creating a thread
    t3.start();
}}

