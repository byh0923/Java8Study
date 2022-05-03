package com.example.java8study;

// functionalInterface라고 알려주는 어노테이션
@FunctionalInterface
public interface RunSomething {

    // 추상 메서드가 하나 있으면 함수형 인터페이스이다.
    int doIt(int number);

    // static 이나 public 생략 가능
    static void printName() {
        System.out.println("Yhbae");
    }

    // default method 정의 가능
    default void printAge() {
        System.out.println("30");
    }

}
