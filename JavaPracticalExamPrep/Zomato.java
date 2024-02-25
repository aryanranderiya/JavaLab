

import java.util.*;

public class Zomato {
    public static void main(String[] args) {

        final Object lock = new Object();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of orders");
        int number_of_orders = sc.nextInt();

        sc.close();

        createThreadOne(lock, number_of_orders);
        createThreadTwo(lock, number_of_orders);
    }

    public static void createThreadTwo(Object lock, int number_of_orders) {
        Thread t2 = new Thread(new Runnable() {
            public void run() {

                synchronized (lock) {
                    for (int i = 1; i <= number_of_orders; i++) {
                        System.out.println("Delivered Order - " + i);
                        lock.notify();
                        try {
                            if (i < number_of_orders) {
                                lock.wait();
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                ;

            }
        });

        t2.start();
    }

    public static void createThreadOne(Object lock, int number_of_orders) {
        Thread t1 = new Thread(new Runnable() {
            public void run() {

                synchronized (lock) {
                    for (int i = 1; i <= number_of_orders; i++) {
                        System.out.println("Order Placed - " + i);
                        lock.notify();
                        try {
                            if (i < number_of_orders) {
                                lock.wait();
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
                ;

            }
        });
        t1.start();
    }
}
