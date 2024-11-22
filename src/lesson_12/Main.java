package lesson_12;

public class Main {
    volatile int a;

    public static void main(String[] args) {
        deadlockExample();
        System.out.println("Done!");
    }

    private static void deadlockExample() {
        Object lock1 = new Object();
        Object lock2 = new Object();

        Thread t1 = new Thread(() -> {
            System.out.println("Started t1");
            synchronized (lock1) {
                System.out.println("T1 locked lock1");

                synchronized (lock2) {
                    System.out.println("T1 locked lock2");
                }
            }
            System.out.println("T1 finished");
        });
        Thread t2 = new Thread(() -> {
            System.out.println("Started t2");
            synchronized (lock2) {
                System.out.println("T2 locked lock2");

                synchronized (lock1) {
                    System.out.println("T2 locked lock1");
                }
            }
            System.out.println("T2 finished");
        });
        t1.start();
        t2.start();
    }

    private static void syncExample() {
        Object lock = new Object();
        Thread thread1 = new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 5000; i++) {
                    System.out.println("Thread 1: " + i);
                }
            }
        });
        Thread thread2 = new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 5000; i++) {
                    System.out.println("Thread 2: " + i);
                }
            }
        });
        Thread thread3 = new Thread(() -> {
            synchronized (lock) {
                for (int i = 0; i < 5000; i++) {
                    System.out.println("Thread 3: " + i);
                }
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("ASDGH");
    }
}
