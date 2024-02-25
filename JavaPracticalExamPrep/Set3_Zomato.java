
import java.util.*;

class Thread1 extends Thread {

    Object lock;
    int number_of_order;

    Thread1(Object lock, int number_of_order) {
        this.lock = lock;
        this.number_of_order = number_of_order;
    }

    public void run() {
        synchronized (lock) {
            for (int i = 1; i <= number_of_order; i++) {
                System.out.println("Order Placed - " + i);
                lock.notify();
                try {
                    Thread.sleep(500);
                    if (i < number_of_order) {
                        lock.wait();
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class Thread2 extends Thread {

    Object lock;
    int number_of_order;

    Thread2(Object lock, int number_of_order) {
        this.lock = lock;
        this.number_of_order = number_of_order;

    }

    public void run() {
        synchronized (lock) {
            for (int i = 1; i <= number_of_order; i++) {
                System.out.println("Delivered Order - " + i);
                lock.notify();
                try {
                    Thread.sleep(500);

                    if (i < number_of_order) {
                        lock.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

public class Set3_Zomato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of orders to place:");
        int number_of_order = sc.nextInt();

        final Object lock = new Object();

        Thread1 t1 = new Thread1(lock, number_of_order);
        Thread2 t2 = new Thread2(lock, number_of_order);

        t1.start();
        t2.start();

    }
}
