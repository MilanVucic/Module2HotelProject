package lesson_4;

public interface Callback<T> {
    void onSuccess(T result);
    void onError(String message);
}
