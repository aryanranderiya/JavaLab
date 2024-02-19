class Threads implements Runnable {

    String name;

    Threads(String name) {
        this.name = name;
    }

    public void run() {
        System.out.println("Thread " + name + " has been started!");

        for (int i = 0; i <= 5; i++) {
            if (i == 3)
                sleepTheThread(name);
            System.out.println("Thread " + name + " " + i);
        }
    }

    public static void sleepTheThread(String name) {
        System.out.println("Thread " + name + " Slept");
        try {
            Thread.sleep(1000);

        } catch (Exception e) {
            System.out.println("Exception" + e);
        }
    }
}

class Experiment7_Pr4 {
    public static void main(String[] args) {
        new Thread(new Threads("1")).start();
        new Thread(new Threads("2")).start();
        new Thread(new Threads("3")).start();
    }
}