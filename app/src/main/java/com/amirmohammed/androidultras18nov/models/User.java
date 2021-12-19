package com.amirmohammed.androidultras18nov.models;

// Non access modifiers => final , static , abstract
public class User{

    public final String name;

    public User(String name) {
        super();
        this.name // global variable
                = name; // local variable
    }

    public static String carer; // class variable

    // Overloading
    // Parameters

    public String valueOf(int number) {
        return "";
    }

    public String valueOf() {
        return "";
    }

    public void test() {
    }

    void test(String name) {

    }

    void test(int number) {

    }

    void test(double number) {

    }

    void test(int numberOne, int numberTwo) {

    }

    void test(double numberOne, double numberTwo){

    }

    void test(int numberOne, double numberTwo){

    }

    void test(double numberOne, int numberTwo){

    }

}
