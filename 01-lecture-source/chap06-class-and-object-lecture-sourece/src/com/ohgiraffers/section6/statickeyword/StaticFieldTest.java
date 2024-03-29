package com.ohgiraffers.section6.statickeyword;

public class StaticFieldTest {
    private int nonStaticCount;
    private static int staicCount;

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
