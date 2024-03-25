package com.ohgiraffers.level01.basic;

public class Application {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("10과 20의 합 : " + calc.sumTwoNumber(10, 20));
        System.out.println("10과 5의 차 : " + calc.minusTwoNumber(10, 5));
        System.out.println("10과 5의 곱 : " + calc.multiTwoNumber(10, 5));
        System.out.println("10과 5의 나눈 후의 몫 : " + calc.divideTwoNumber(10, 5));
    }
}
