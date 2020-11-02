package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        MyLinkedList<Integer> ll = new MyLinkedList<>();
        ll.add(45);
        ll.add(416);
        ll.add(35);
        ll.add(17);
        ll.add(300);
        System.out.println(ll.size());
        ll.remove(250);
        ll.list();
    }

}

