package Module5;
//Write a program to illustrate deadlock concept (demonstration code).
class C1{}
class C2{}

public class DeadlockDemo {
    static C1 o1 = new C1();
    static C2 o2 = new C2();

    public static void main(String[] args) {
        Thread t1 = new Thread() {
            public void run() {
                synchronized (o1) {
                    System.out.println("Thread1 locked o1");
                }
                try {
                    Thread.sleep(100);
                }
                catch(Exception e){
                    System.out.println(e);
                }
                synchronized (o2){
                    System.out.println("Thread1 locked o2");
                }

            }
        };
        Thread t2 = new Thread(){
            public void run(){
                synchronized (o2){
                    System.out.println("Thread2 locked o2");
                }
                try{
                    Thread.sleep(100);
                }
                catch(Exception e){
                    System.out.println(e);
                }
                synchronized (o1){
                    System.out.println("Thread2 locked o1");
                }
            }
        };
        t1.start();
        t2.start();
    }
}
