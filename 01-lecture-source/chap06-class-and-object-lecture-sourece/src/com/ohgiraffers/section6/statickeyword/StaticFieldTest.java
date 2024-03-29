package com.ohgiraffers.section6.statickeyword;

public class StaticFieldTest {
    private int nonStaticCount; //논스태틱 속성 생성
    private static int staicCount; //스태틱 속성 생성

    public StaticFieldTest(){}

    public int getNonStaticCount() {
        return this.nonStaticCount;
    }

    public int getStaicCount() {
        return StaticFieldTest.staicCount;
    }

    public void increaseNonStaticCount(){this.nonStaticCount++;}
    public void increaseStaticCount(){StaticFieldTest.staicCount++;}
}
