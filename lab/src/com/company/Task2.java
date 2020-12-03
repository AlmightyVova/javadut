package com.company;

import java.lang.reflect.Array;
import java.util.Random;

public class Task2 {
    public static void main() {
        Random random = new Random();
        int n = 5;
        int[] arr = random.ints(n, 0, 9).toArray();
        for (var item :
                arr) {
            System.out.println(item);
        }
    }
}
