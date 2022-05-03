package com.example.java8study;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {
    public static void main(String[] args) {
        // 메서드를 functional 인터페이스의 구현체로 사용한다.
        // greeting에 있는 hi라는 static 메서드를 사용하겠다.
        UnaryOperator<String> hi = Greeting::hi;

        // 특정 인스턴스 메서드를 사용할 때
        Greeting greeting = new Greeting();
        UnaryOperator<String> hi2 = greeting::hello;

        // 생성자 생성
        Supplier<Greeting> newGreeting = Greeting::new;
        newGreeting.get();

        String[] names = {"yhbae", "baeyh", "younghyun"};
        Arrays.sort(names, String::compareToIgnoreCase);

        Too too = new DefaultToo("yhbae");
        too.printName();
        too.printNameUpperCase();
    }
}
