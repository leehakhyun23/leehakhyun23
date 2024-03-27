package com.ohgiraffers.test2;

import com.ohgiraffers.test.TestMethod;

public class Application {
    public static void main(String[] args) {
        TestMethod a = new TestMethod();
        a.Calculator(2,5);
        System.out.println("원의 넓이는 " + a.CircleArea() + "입니다.");
        System.out.println(a.TestRandom());
    }
}
