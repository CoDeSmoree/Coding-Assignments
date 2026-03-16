package Module5;

//Write a program to demonstrate thread life cycle states.

public class ThreadLC extends Thread {

    public void run() {
        try {
            System.out.println("Thread is running");
            Thread.sleep(200); // Timed Waiting state
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {

        ThreadLC t1 = new ThreadLC();

        // NEW state
        System.out.println("State after creating thread: " + t1.getState());

        t1.start();

        // RUNNABLE state
        System.out.println("State after starting thread: " + t1.getState());

        Thread.sleep(50);

        // TIMED_WAITING state
        System.out.println("State while thread is sleeping: " + t1.getState());

        t1.join();

        // TERMINATED state
        System.out.println("State after thread finishes: " + t1.getState());
    }
}