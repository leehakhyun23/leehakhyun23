package com.ohgiraffers.test;

import org.w3c.dom.ls.LSOutput;

public class Application {
    public static void main(String[] args) {
        int i = 1;
        short s = 2;
        byte b = 3;
        long l = 4;
        float f = 1.0f;
        double d =1.1;
        char c = '1';
        boolean t = true;
        long sum;
        sum = i + l;
        System.out.println(sum);
        String str = (sum > 0) ? "양수입니다.":"음수입니다";
        System.out.println(str);


    }

}
