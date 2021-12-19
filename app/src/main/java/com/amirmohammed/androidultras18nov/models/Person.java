package com.amirmohammed.androidultras18nov.models;

public class Person {

    public final String name;

    public Person(String name) {
        this.name = name;
    }

    public void printData(){
        System.out.println("- - - - - - - - - ");
        System.out.println("Name : " + name);
    }

}
