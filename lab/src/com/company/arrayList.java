package com.company;

import java.util.Arrays;

public class arrayList<T> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public arrayList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public void add(T t) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = t;
    }


    private void ensureCapacity() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public T get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (T) elements[i];
    }
    public int size(){
        return size;
    }
    public boolean contains(T data){
        for (int i = 0; i < size; i++){
            if(elements[i] == data) {
                return true;
            }
        }
        return false;
    }
}
