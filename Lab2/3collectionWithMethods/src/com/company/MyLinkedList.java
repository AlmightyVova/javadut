package com.company;

public class MyLinkedList<T> {
    Node head;
    int size;

    class Node {
        T data;
        Node next;

        Node(T d) {
            data = d;
        }
    }

    public MyLinkedList<T> add(T data) {
        size++;
        Node newNode = new Node(data);
        newNode.next = null;
        if (head == null) {
            head = newNode;
            return this;
        } else {
            Node tail = head;
            while (tail.next != null) {
                tail = tail.next;
            }
            tail.next = newNode;
            return this;
        }
    }

    public T remove() {
        size--;
        T removed;
        if (head.next == null) {
            removed = head.data;
            head = null;
            return removed;
        } else {
            Node currentNode = head.next;
            while (currentNode.next.next != null) {
                currentNode = currentNode.next;
            }
            removed = currentNode.next.data;
            currentNode.next = null;
            return removed;
        }
    }

    public T remove(int position) {
        if (position >= size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        Node currentNode = head;
        for (int i = 0; currentNode != null && i < position - 1; i++) {
            currentNode = currentNode.next;
        }
        T removed = currentNode.next.data;
        Node next = currentNode.next.next;
        currentNode.next = next;
        return removed;
    }

    public int size() {
        return size;
    }

    public boolean contains(T data) {
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
            if (currentNode.data == data)
                return true;
        }
        return false;
    }

    public void list() {
        Node currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }
}
