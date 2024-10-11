package lesson_6;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Marco", "Milan", "Marco", "Krzysztof", "Lin", "Maximilian");
        Set<String> set = new HashSet<>();

    }

    private static void streamExamples(List<String> names) {
        System.out.println(names.stream()
                .filter(name -> name.startsWith("M"))
                .distinct()
                .sorted((s1, s2) -> s2.length() - s1.length())
                .toList());
        System.out.println(names.stream()
                .map((name) -> name.length())
                .toList());
        Optional<String> name = names.stream()
                .filter(s -> s.length() > 20)
                .findFirst();
        if (name.isPresent()) {
            System.out.println(name.get());
        } else {
            System.out.println("Nothing found.");
        }
    }

    private static void functionalMethods(List<String> names) {
        NamePrinter namePrinter = new NamePrinter("aasd...");
        names.forEach(namePrinter::print);
        names.forEach(Main::print);
        names.forEach(NamePrinter::new);
    }

    private static void print(String name) {
        System.out.println(name);
    }

    private static void lambdaExample() {
        SortedMap<String, String> map = new TreeMap<>((o1, o2) -> o1.length() - o2.length());

        List<Integer> list = new ArrayList<>(List.of(331, 22, 3, 54, 5, 64));

        System.out.println(numOfDigits(1503));
        list.sort((o1, o2) -> numOfDigits(o2) - numOfDigits(o1));
        System.out.println(list);
    }

    private static int numOfDigits(int number) {
        int digits = 0;
        while (number > 0) {
            number /= 10;
            digits++;
        }
        return digits;
    }
}
