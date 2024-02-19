class Pr5_Thread2 extends Thread {
    public void run() {
        System.out.println("Thread 2 has been started");
    }
}

class Pr5_Thread1 extends Thread {
    public void run() {
        System.out.println("Thread 1 has been started");
    }
}

public class Experiment7_Pr5 {
    public static void main(String[] args) {
        Pr5_Thread1 thread1 = new Pr5_Thread1();
        Pr5_Thread2 thread2 = new Pr5_Thread2();

        thread1.start();
        thread2.start();
        System.out.println("Thread 1 is alive? " + thread1.isAlive());
        System.out.println("Thread 2 is alive? " + thread2.isAlive());
    }
}
