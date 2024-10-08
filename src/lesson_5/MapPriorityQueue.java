package lesson_5;

import java.util.*;

public class MapPriorityQueue<T extends HasPriority> implements MyPriorityQueue<T> {
    // 1 -> {milan, marco, someone}
    // 2 -> {..., ...}
    SortedMap<Integer, List<T>> priorityMap = new TreeMap<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o2.compareTo(o1);
        }
    });

    @Override
    public void put(T item) {
        List<T> list = priorityMap.get(item.getPriority()) != null ?
                priorityMap.get(item.getPriority()) : new ArrayList<>();
        list.add(item);
        priorityMap.put(item.getPriority(), list);
    }

    @Override
    public T getNext() {
        try {
            Integer key = priorityMap.firstKey();
            List<T> list = priorityMap.get(key);
            T elem = list.remove(0);
            if (list.size() == 0) {
                priorityMap.remove(key);
            } else {
                priorityMap.put(key, list);
            }
            return elem;
        } catch (NoSuchElementException e) {
            return null;
        }
    }
}
