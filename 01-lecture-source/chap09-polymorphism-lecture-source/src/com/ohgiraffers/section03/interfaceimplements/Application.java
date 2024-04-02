package com.ohgiraffers.section03.interfaceimplements;

public class Application {
    public static void main(String[] args) {
        /* 인터페이스(interface)에 대해 이해할 수 있다.
        *
        * 인터페이스
        * 여기서 다루게 되는 인터페이스는 자바의 클래스와 유사한 형태지만
        * 추상메소드와 상수 필드만 가질 수 있는 클래스의 변형체를 말한다.
        * */

        /*
        * 인터페이스 사용 목적
        * 1. 추상클래스와 비슷하게 필요한 기능을 공동화해서 강제성을 부여할 목적으로 사용한다.
        * */

        //InterProduct interProduct = new InterProduct();

        InterProduct interProduct = new Product();
        interProduct.nonStaticMethod();
        interProduct.absMethod();
        interProduct.defaultMethod();

        InterProduct.staticMethod();

        System.out.println(InterProduct.MAX_NUM);
        System.out.println(InterProduct.MIN_NUM);
    }
}
