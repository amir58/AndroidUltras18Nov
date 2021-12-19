package com.amirmohammed.androidultras18nov.screens;

public interface ITest extends IPlay, ISleep {

    public static final String BASE_URL = "https://www.google.com";

    // abstract function => cannot have body
    public abstract void sum();

    default void multi() {

    }

}
