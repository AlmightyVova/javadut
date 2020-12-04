package com.company;

import java.io.*;

public class sImp {
    private static final long serialVersionUID = 1L;
    static String name = "Name";
    private String surname = "Surname";
    private int age;
    transient String wontSave;

    public boolean setAge(int age){
        this.age = age;
        return true;
    }

    public boolean setName(String age){
        this.name = name;
        return true;
    }

    public void seNDese()
            throws IOException, ClassNotFoundException {
        sImp person = new sImp();
        person.setAge(20);
        person.setName("Joe");

        FileOutputStream fileOutputStream
                = new FileOutputStream("file.txt");
        ObjectOutputStream objectOutputStream
                = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(person);
        objectOutputStream.flush();
        objectOutputStream.close();

        FileInputStream fileInputStream
                = new FileInputStream("file.txt");
        ObjectInputStream objectInputStream
                = new ObjectInputStream(fileInputStream);
        sImp p2 = (sImp) objectInputStream.readObject();
        objectInputStream.close();
    }
}


