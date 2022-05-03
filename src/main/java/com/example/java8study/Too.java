package com.example.java8study;

import java.util.Locale;

public interface Too {

    void printName();

    default void printNameUpperCase() {
        System.out.println(getName().toUpperCase());
    }


    public String getName();
}
