package com.company;

import java.util.ArrayList;
import java.util.Random;


class BeginEqualsEndException extends Exception {
    public BeginEqualsEndException() {
        super("begin equals to end, politely declined to proceed");
    }
}

class ZeroStepException extends Exception {
    public ZeroStepException() {
        super("Step is less than 0, politely declined to proceed");
    }
}

class AsymmetricMatrixException extends Exception {
    public AsymmetricMatrixException() {
        super("Step is less than 0, politely declined to proceed");
    }
}

public class Main {


    public static void main(String[] args) throws AsymmetricMatrixException, ZeroStepException, BeginEqualsEndException {
        int[][] twoDArr = fillTwoDArray(3, 3);
        System.out.printf("Length is: %d", twoDArr.length);
        printArray(twoDArr);
        printSecondDiagonalEvenNumbers(twoDArr);
        int[] arr = fillArray(0, 10, 2);
        printArray(arr);
        System.out.println();
    }


    private static int[][] fillTwoDArray(int rows, int columns) {
        Random rand = new Random();
        int[][] arr = new int[rows][columns];
        for (int i = 0; i < arr.length; i++)
            for (int j = 0; j < arr[0].length; j++)
                arr[i][j] = rand.nextInt(10);
        return arr;
    }

    private static void printArray(int[] arr) {
        System.out.print("\nArray ( ");
        for (int item : arr)
            System.out.printf("%d ", item);
        System.out.print(")");
    }

    private static void printArray(int[][] arr) {
        System.out.println("\nTwo Dimensional Array (");
        for (int[] item : arr) {
            for (int item2 : item)
                System.out.printf("%d ", item2);
            System.out.println();
        }
        System.out.print(")");
    }

    private static void printSecondDiagonalEvenNumbers(int[][] arr) throws AsymmetricMatrixException {
        if(arr.length != arr[0].length){
            throw new AsymmetricMatrixException();
        }

        if (arr.length == arr[0].length) {
            ArrayList<Integer> evenNumbers = new ArrayList();
            for (int i = 0; i < arr.length; i++) {
                if (arr[arr.length - 1 - i][i] % 2 == 0)
                    evenNumbers.add(arr[arr.length - 1 - i][i]);
            }
            System.out.print("\nEven numbers of the second diagonal: ");
        } else {
            System.out.println("The matrix is asymmetric");
        }
    }

    private static int[] fillArray(int begin, int end, int step) throws BeginEqualsEndException, ZeroStepException {
        if (begin == end) {
            throw new BeginEqualsEndException();
        }
        if (step == 0) {
            throw new ZeroStepException();
        }

        if (begin > end) {
            int temp = end;
            end = begin;
            begin = temp;
        }

        final int length = (end - begin) / step + 1;
        int[] arr = new int[length];

        for (int i = 0, current = begin; i < arr.length; i++, current += step) {
            arr[i] = current;
        }

        return arr;
    }
}
