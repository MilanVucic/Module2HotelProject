package lesson_11;

public class CountdownTimer extends Thread {
    private int time;
    private OnCountDown countdownCallback;

    public CountdownTimer(int time, OnCountDown countdownCallback) {
        this.time = time;
        this.countdownCallback = countdownCallback;
    }

    @Override
    public void run() {
        while (time > 0) {
            countdownCallback.onTick(time--);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        countdownCallback.onFinish();
    }
}
