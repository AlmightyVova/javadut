package com.company;

class linkedList<T> {

    private static int counter;
    private Node head;

    public linkedList() {

    }

    public void add(Object data) {

        if (head == null) {
            head = new Node(data);
        }

        Node temp = new Node(data);
        Node current = head;

        if (current != null) {

            while (current.getNext() != null) {
                current = current.getNext();
            }

            current.setNext(temp);
        }

        counter++;
    }

    public T get(int index) {
        if (index < 0)
            return null;
        Node current = null;
        if (head != null) {
            current = head.getNext();
            for (int i = 0; i < index; i++) {
                if (current.getNext() == null)
                    return null;

                current = current.getNext();
            }
            return (T) current.getData();
        }
        return null;
    }

    public boolean remove(int index) {

        // if the index is out of range, exit
        if (index < 1 || index > size())
            return false;

        Node current = head;
        if (head != null) {
            for (int i = 0; i < index; i++) {
                if (current.getNext() == null)
                    return false;

                current = current.getNext();
            }
            current.setNext(current.getNext().getNext());

            counter--;
            return true;

        }
        return false;
    }

    public int size() {
        return counter;
    }

    public boolean contains(T data) {
        if (counter < 0)
            return false;
        Node current = null;
        if (head != null) {
            current = head.getNext();
            for (int i = 0; i < counter; i++) {
                if (current.getNext() == null)
                    return false;

                current = current.getNext();
                if(current.getData() == data)
                    return true;
            }
        }
        return false;
    }

    private class Node {
        Node next;

        T data;

        public Node(Object dataValue) {
            next = null;
            data = (T) dataValue;
        }

        public Node(Object dataValue, Node nextValue) {
            next = nextValue;
            data = (T) dataValue;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object dataValue) {
            data = (T) dataValue;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node nextValue) {
            next = nextValue;
        }

    }
}
