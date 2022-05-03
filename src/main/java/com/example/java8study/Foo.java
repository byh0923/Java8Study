package com.example.java8study;

import java.util.function.*;

public class Foo {
    public static void main(String[] args) {

        int baseNumber = 10;

        // 익명 내부 클래스 anonymous inner class
        // 함수형 인터페이스를 구현할 때 사용
        RunSomething runSomething = number -> number + baseNumber;

        // 같은 파라미터를 넣었을 때 항상 동일 결과가 나와야 함
        System.out.println(runSomething.doIt(2));



        /*
         * 자바에서 기본으로 제공하는 함수형 인터페이스
         * java.lang.function 패키지에 들어있음
         * */

        Function<Integer, Integer> plus10 = (number) -> number + 10;
        Function<Integer, Integer> multiply2 = (i) -> i * 2;

        // 함수 조합할 수 있는 메서드를 제공해줌 andThen, compose
        // compose=> 파라메터에 있는 함수를 먼저 실행하고 다음에 실행함.
        Function<Integer, Integer> multiply2AndPlus10 = plus10.compose(multiply2);
        System.out.println(multiply2AndPlus10.apply(2));

        // 지금 있는 함수 뒤에 붙임
        System.out.println(plus10.andThen(multiply2).apply(2));

        /**
         * biFunction 입력값을 2개 받음
         * Consumer는 받아서 아무것도 리턴하지 않는다.
         * supplier 받아올 값의 타입을 정의함.
         * */
        Supplier<Integer> get10 = () -> 10;
        System.out.println(get10.get());
        // predicate 어떠한 인자값을 하나 받아서 true, false를 return해줌
        Predicate<String> startsWithYH = (s) -> s.startsWith("YH");
        Predicate<Integer> isEven = (i) -> i%2 == 0;

        // UnaryOperator 입력값의 타입과 결과값의 타입이 같은 경우 사용
        UnaryOperator<Integer> multiply2AndPlus10Copy = (i) -> i + 2;


        // 람다 표현식
        BinaryOperator<Integer> sum = (a,b) -> a + b;

    }

}
