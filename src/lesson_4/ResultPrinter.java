package lesson_4;

public class ResultPrinter implements Callback<Integer>{
    @Override
    public void onSuccess(Integer result) {
        System.out.println(result);
    }

    @Override
    public void onError(String message) {
        System.out.println(message);
    }
}
