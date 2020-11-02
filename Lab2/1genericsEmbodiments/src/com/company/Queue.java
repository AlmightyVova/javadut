package com.company;

public class Queue<T> {
    QueueNode front;

    class QueueNode {
        T data;
        QueueNode next;

        QueueNode(T data) {
            this.data = data;
        }
    }

    public void add(T data) {
        QueueNode newNode = new QueueNode(data);
        if (front == null) {
            front = newNode;
        } else {
            QueueNode node;
            node = front;
            while (node.next != null) {
                node = node.next;
            }
            node.next = newNode;
        }
    }

    public void list() {
        QueueNode node;
        node = front;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    public T remove() {
        QueueNode node = front, oldNode;
        if (front == null) {
            System.out.println("Stack is empty");
        } else {
            while (node.next.next != null) {
                node = node.next;
            }
            oldNode = node.next;
            node.next = null;
            return (T) oldNode;
        }
        return null;
    }

    public T get() {
        if (front == null) {
            System.out.println("Stack is empty");
            return null;
        } else {
            return front.data;
        }
    }
}
