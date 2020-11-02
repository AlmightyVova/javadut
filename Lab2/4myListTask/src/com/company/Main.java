package com.company;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Main {

    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        sort(myList);

        final int SIZE = ThreadLocalRandom.current().nextInt(10, 101);
        System.out.println("SIZE IS " + SIZE);
        int[] arr = new int[SIZE];

        System.out.print("Array is: ");
        fill(arr);
        for (int item : arr) {
            System.out.printf("%d", item);
        }
        System.out.println();
        System.out.println("The average is: "+calcAverage(arr));



        System.out.println();
    }

    public static void sort(List<String> list) {
        List<String> tempList = new ArrayList<>();
        for (String item : list) {
            if (item.charAt(0) == 'c') {
                tempList.add(item);
            }
        }
        Collections.sort(tempList);
        System.out.println(tempList);
    }

    public static int[] fill(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ThreadLocalRandom.current().nextInt(0, 10);
        }
        return arr;
    }

    public static float calcAverage(int[] arr) {
        float sum = 0;
        for (int item : arr) {
            if (item % 2 == 0) {
                sum += item;
            }
        }

        final float result = sum / arr.length;
        return result;
    }
}