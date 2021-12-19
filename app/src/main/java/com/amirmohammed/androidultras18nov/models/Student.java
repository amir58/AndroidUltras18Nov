package com.amirmohammed.androidultras18nov.models;

public class Student extends Person {

    private final String id;


    public Student(String name, String id) {
        super(name);
        this.id = id;
    }

    @Override
    public void printData() {
        super.printData();
        System.out.println("Id : " + id);
    }
}
