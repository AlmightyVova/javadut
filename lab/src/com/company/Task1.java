package com.company;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main() {
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        List<String> filteredAndSortedList = myList.stream()
                .filter(p -> p.charAt(0) == 'c')
                .sorted((o1, o2) -> o1.compareTo(o2))
                .map(p -> p.toUpperCase())
                .collect(Collectors.toList());
        for (var item :
                filteredAndSortedList) {
            System.out.println(item);
        }
    }
}
