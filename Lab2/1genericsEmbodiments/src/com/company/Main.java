package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
      /*  ArrayList<String> strArr = new ArrayList<>();
        myArrayList<String> myStrArr = new myArrayList<>();

        strArr.add("Hello world0!");
        strArr.add("Hello world1!");
        strArr.add("Hello world2!");
        strArr.add("Hello world3!");
        System.out.println(strArr.get(2));

        myStrArr.add("hello world0!");
        myStrArr.add("hello world1!");
        for (int i = 0; i < myStrArr.size(); i++) {
            System.out.println(myStrArr.get(i));
        }
        myStrArr.remove();
        System.out.println();
        for (int i = 0; i < myStrArr.size(); i++) {
            System.out.println(myStrArr.get(i));
        }

        Stack<Integer> sll = new Stack<>();

        sll.add(10);
        sll.add(20);
        sll.add(30);

        System.out.println(sll.remove() + " popped from stack");

        System.out.println("Top element is " + sll.get());

        */
        Queue<Integer> queue = new Queue<>();

        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.list();
        queue.remove();
        queue.list();
    }

}

