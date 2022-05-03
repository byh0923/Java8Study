package com.example.java8study;

public class DefaultToo implements Too{

    String name;

    public DefaultToo(String name) {
        this.name = name;
    }

    @Override
    public void printName() {
        System.out.println("DefaultToo");
    }

    @Override
    public String getName() {
        return this.name;
    }
}
