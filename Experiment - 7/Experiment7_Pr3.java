class Pr2_Thread1 extends Thread {
    public void run() {
        System.out.println("Thread 1 is running!");
    }
}

class Pr2_Thread2 extends Thread {
    public void run() {
        System.out.println("Thread 2 is running!");
    }
}

class Experiment7_Pr3 {
    public static void main(String[] args) {
        Pr2_Thread1 thread1 = new Pr2_Thread1();
        Pr2_Thread2 thread2 = new Pr2_Thread2();
        thread1.setPriority(1);
        thread2.setPriority(10);
        thread1.start();
        thread2.start();
    }
}