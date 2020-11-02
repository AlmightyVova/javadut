package com.company;

public class Stack<T> {
    StackNode top;

    class StackNode {
        T data;
        StackNode next;

        StackNode(T data) {
            this.data = data;
        }
    }

    public void add(T data) {
        StackNode newNode = new StackNode(data);

        if (top == null) {
            top = newNode;
        } else {
            StackNode temp = top;
            top = newNode;
            newNode.next = temp;
        }
        System.out.println(data + " stacked");
    }

    public T remove() {
        if (top == null) {
            System.out.println("Stack is empty");
            return null;
        } else {
            T popped = top.data;
            top = top.next;
            return popped;
        }

    }

    public T get() {
        if(top == null) {
            System.out.println("Stack is empty");
            return null;
        } else {
            return top.data;
        }
    }
}
