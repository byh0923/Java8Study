package com.example.java8study;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class Poo {

    public static void main(String[] args) {
        Poo poo = new Poo();
        poo.run();
    }

    private void run() {
        int baseNumber = 10;

        IntConsumer printInt = (i) -> System.out.println(i + baseNumber);

        printInt.accept(10);
    }
}
