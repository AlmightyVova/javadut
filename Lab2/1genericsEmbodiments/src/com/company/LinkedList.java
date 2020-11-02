package com.company;

public class LinkedList<T> {
    private Node head = null;

    private class Node {
        T value;
        Node next;

        Node(T value) {
            this.next = head;
            this.value = value;
            head = this;
        }
    }

    public void add(T t) {
        new Node(t);
    }

    public void remove(T t) {}

    public void contains(T t) {}

    public void list() {
        for (Node n = head; n != null; n = n.next)
            System.out.println("LinkedList output: "+n.value);
    }
}
