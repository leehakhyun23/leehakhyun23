package com.ohgiraffers.section6.statickeyword;

public class StaticMethodTest {
    private int count;

    public void nonStaticMethod(){
        this.count++;
        System.out.println("nonStaticMethod 호출함");
    }
    public static void staticMethod(){
         //StaticMethodTest.count++;

        System.out.println("staticmethod 호출함");
    }



}
