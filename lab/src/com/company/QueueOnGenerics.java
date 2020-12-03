package com.company;

class QueueOnGenerics<T> {
    class Node {
        T data;
        Node next;

        Node(T x) {
            data = x;
            next = null;
        }
    }

    Node front, rear;

    public QueueOnGenerics() {
        front = rear = null;
    }

    public boolean isEmpty() {
        return (front == null);
    }

    public T remove() throws Exception {
        if (isEmpty())
            throw new Exception("Queue is empty.");
        Node temp = front;
        front = front.next;
        return temp.data;
    }

    public void insert(T data) {
        Node temp = new Node(data);
        if (isEmpty()) {
            front = rear = temp;
        } else {
            rear.next = temp;
            rear = temp;
        }
    }
}