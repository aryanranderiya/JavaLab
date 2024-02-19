
class Thread_2 extends Thread {

    public static int i = 0;

    public void run() {
        System.out.println("Thread has been started");
        System.out.println("Thread is Running!");

        for (i = 0; i <= 10; i++) {
            System.out.println("Thread2 - " + i);

            // Sleep Thread for 2 seconds
            if (i == 6) {
                try {
                    System.out.println("Thread 2 has sleeped for 2 seconds.");
                    Thread.sleep(2000);
                } catch (Exception e) {
                }
            }

            // Yield Thread to the other Thread
            if (i == 3) {
                System.out.println("Thread 2 has yielded to Thread 3.");
                Thread.yield();
            }

            // Suspend the thread
            if (i == 5) {
                System.out.println("Thread 2 has been suspended.");
                suspend();
            }

            // Stop the thread
            if (i == 8) {
                System.out.println("Thread 2 has stopped.");
                stop();
            }
        }
    }

}

class Thread_3 extends Thread {

    public void run() {
        System.out.println("Thread has been started");
        System.out.println("Thread 3 is running");
        try {
            System.out.println("Thread 3 is waiting");
            wait();
        } catch (Exception e) {
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println("Thread3 - " + i);
        }
    }
}

public class Experiment7_Pr2 extends Thread_2 {
    public static void main(String[] args) {
        Thread_2 thread2 = new Thread_2();
        Thread_3 thread3 = new Thread_3();
        thread2.start();
        thread3.start();

    }
}
