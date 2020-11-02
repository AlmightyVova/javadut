package com.company;

import java.util.Arrays;
import java.util.Objects;

public class myArrayList<T>{
    private int size;
    private Object[] elements;
    private T t;

    myArrayList() {
        elements = new Object[10];
    }

    public T get(int index) {
        Objects.checkIndex(index, size);
        return (T) elements[index];
    }

    public void add(T t) {
        this.t = t;

        if (size == elements.length - 1) {
            elements = Arrays.copyOf(elements, elements.length + 5);
        }

        elements[size] = this.t;
        size++;
    }

    public void remove() {
        elements = Arrays.copyOf(elements, elements.length - 1);
        size--;
    }

    public int size() {
        return size;
    }

    public int contains(T t) {
        int position = -1;
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == t) {
                position = i;
            }
        }
        return position;
    }


}