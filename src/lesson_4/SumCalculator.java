package lesson_4;

public class SumCalculator{
    private int[] array;
    private Callback<Integer> callback;

    public SumCalculator(int[] array, Callback<Integer> callback) {
        this.array = array;
        this.callback = callback;
    }

    public void calculateResult() {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        callback.onSuccess(sum);
    }
}
