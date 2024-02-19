class Thread2 extends Thread {
    public void run() {
        System.out.println("Thread 2 has been started");
        System.out.println("Thread 2 is Running!");
    }
}

class Thread3 extends Thread {
    public void run() {
        System.out.println("Thread 3 has been started");
        System.out.println("Thread 3 is Running!");
    }
}

public class Experiment7_Pr1 extends Thread {
    public static void main(String[] args) {
        Experiment7_Pr1 thread1 = new Experiment7_Pr1();
        Thread2 thread2 = new Thread2();
        Thread3 thread3 = new Thread3();
        thread1.start();
        thread2.start();
        thread3.start();
    }

    public void run() {
        System.out.println("Thread 1 has been started");
        System.out.println("Thread 1 is Running!");
    }
}
