package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        for(int el : sortArray(new int[]{5,3,2,8,1,4})) {
            System.out.print(el+" ");
        }
        System.out.println();
    }

    public static int[] sortArray(int[] arr) {
        ArrayList<Integer> oddPos = new ArrayList<>();
        ArrayList<Integer> odds = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 > 0 && arr[i] != 0) {
                oddPos.add(i);
                odds.add(arr[i]);
            }
        }
        Collections.sort(odds);
        for(int i = 0; i < oddPos.stream().count(); i++){
            arr[oddPos.get(i)] = odds.get(i);
        }
        return arr;
    }
}
