package lesson_10;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        RecursiveLinkedList<Integer> list = new RecursiveLinkedList<>();
        list.add(10);
        list.add(12);
        list.add(50);
        System.out.println(list.size());
        list.printAll();
    }

    private static boolean containsValue(int[] array, int value) {
        return helperContainsValue(array, value, 0);
    }

    private static boolean helperContainsValue(int[] array, int value, int index) {
        if (index == array.length) {
            return false;
        }
        if (array[index] == value) {
            return true;
        }
        return helperContainsValue(array, value, index + 1);
    }

    private static void infinite(int i) {
        System.out.println(i);
        infinite(i + 1);
    }

    private static void printAllFiles(Path path) throws IOException {
        List<Path> paths = Files.list(path).toList();
        for (Path p : paths) {
            if (Files.isDirectory(p)) {
                printAllFiles(p);
            } else {
                System.out.println(p.getFileName());
            }
        }
    }

    private static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    private static int sum(int n) {
        if (n <= 0) {
            return 0;
        }
        return n + sum(n - 1);
    }

    private static void countdown(int number) {
        if (number <= 0) {
            return;
        }
        System.out.println(number);
        countdown(number - 1);
    }
}
