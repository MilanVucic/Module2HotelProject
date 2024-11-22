package lesson_13;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
        Callable<Integer> task = new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return 5;
            }
        };
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> result = executorService.submit(task);


        try {
            System.out.println(result.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        executorService.shutdown();
    }

    private static void threadPrioExample() {
        ThreadGroup threadGroup = new ThreadGroup("basic threads");
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 5000; i++) {
                System.out.println("T1 " + i);
            }
        });
        t1.setPriority(Thread.MIN_PRIORITY);
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 5000; i++) {
                System.out.println("T2 " + i);
            }
        });
        t2.setPriority(Thread.NORM_PRIORITY);
        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 5000; i++) {
                System.out.println("T3 " + i);
            }
        });
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
