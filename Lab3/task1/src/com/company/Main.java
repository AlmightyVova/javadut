package com.company;

import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        System.out.println(findUniq(new double[]{0,0,0.55,0,0}));
    }

    public static double findUniq(double[] arr) {
        double uniq = arr[0];
        for (double el : arr) {
            if(el != uniq){
                return el;
            }
        }
    return uniq;
    }
}
