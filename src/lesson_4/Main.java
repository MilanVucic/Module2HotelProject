package lesson_4;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ResultPrinter resultPrinter = new ResultPrinter();
        FileSaver fileSaver = new FileSaver();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        SumCalculator sumCalculator = new SumCalculator(array, fileSaver);
        sumCalculator.calculateResult();
    }

    private static void intExample() {
        BookStorage storage = new MySQLBookStorage(); // SolarPower
        storage.save(new Book());
        Book aBook = storage.get(10);

        // ArrayList uses array to save data
        // Linked list uses linked nodes to save data
        List<String> list = new LinkedList<>();
        list.add("asdasd"); // a -> b -> c -> asdasd
        list.add("asdasd"); // [a,b,c,asdasd,_,_]
    }
}
