package com.ohgiraffers.test;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TestMethod {
    public static void main(String[] args) {

    }

    public void Calculator(int a, int b) {

        System.out.println(a + " + " + b + "의 합은 " + (a + b) + "입니다.");
        System.out.println(a + " - " + b + "의 차은 " + (a - b) + "입니다.");
        System.out.println(a + " * " + b + "의 곱은 " + (a * b) + "입니다.");
        System.out.println(a + " / " + b + "의 몫은 " + (a / b) + "입니다.");
        System.out.println(a + " % " + b + "의 나머지는 " + (a % b) + "입니다.");
    }

    public double CircleArea() {
        Scanner sc = new Scanner(System.in);
        final double pi = 3.14;
        System.out.println("반지름 값을 입력하세요 : ");
        int r = sc.nextInt();
        return r * r * pi;

    }
    public static String TestRandom() {
        int randomNumber = (int) (Math.random() * 10) + 1;
        String str = "생성된 난수는 " + randomNumber + "입니다.";
        return str;
    }


}


