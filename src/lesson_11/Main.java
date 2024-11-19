package lesson_11;

public class Main {
    public static void main(String[] args) {
        threadsExample();
    }

    private static void timerExample() {
        CountdownTimer timer = new CountdownTimer(10, new OnCountDown() {
            @Override
            public void onTick(int seconds) {
                System.out.println("Time :" + seconds);
            }

            @Override
            public void onFinish() {
                System.out.println("Time ran out. You lost");
            }
        });

        CountdownTimer timer2 = new CountdownTimer(10, new OnCountDown() {
            @Override
            public void onTick(int seconds) {
                System.out.println("SECONDS :" + seconds);
            }

            @Override
            public void onFinish() {
                System.out.println("Time ran out. You won");
            }
        });
        timer.start();
        timer2.start();
    }

    private static void threadsExample() {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 5000; i++) {
                System.out.println("Thread 1: " + i);
            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 5000; i++) {
                System.out.println("Thread 2: " + i);
            }
        });
        Thread thread3 = new Thread(() -> {
            for (int i = 0; i < 5000; i++) {
                System.out.println("Thread 3: " + i);
            }
        });
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
