package lesson_14;

import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerNonStaticClass a = outer.new InnerNonStaticClass();
        OuterClass.InnerStaticClass b = new OuterClass.InnerStaticClass();
    }

    private static void threadLocalExample() {
        ThreadLocal<Integer> value = ThreadLocal.withInitial(() -> 50);
        Thread t1 = new Thread(() -> {
            System.out.println("T1: " + value.get());
            value.set(500);
            System.out.println("T1: " + value.get());
        });
        Thread t2 = new Thread(() -> {
            System.out.println("T2: " + value.get());
            value.set(3000);
            System.out.println("T2: " + value.get());
        });
        Thread t3 = new Thread(() -> {
            System.out.println("T3: " + value.get());
        });
        t1.start();
        t2.start();
        t3.start();
    }

    private static void executorsExample() {
        ThreadFactory threadFactory = new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                thread.setPriority(10);
                return thread;
            }
        };
        ExecutorService service = Executors.newSingleThreadExecutor(threadFactory);
        ScheduledExecutorService s = Executors.newSingleThreadScheduledExecutor();
        Future<Integer> future = s.schedule(() -> 50, 3, TimeUnit.SECONDS);
        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
