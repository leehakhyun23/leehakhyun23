package com.ohgiraffers.section05;

public class ParameterTest {
    public void testPrimaryType(int num){
        System.out.println("매개변수로 전달 받은 값 = " + num );

    }
    public void testPrimaryTypeArray(int[] iarr){
        System.out.println("매개변수로 전달 받은 값 = " + iarr );
        System.out.println("배열의 값 출력 : ");
        for(int i = 0; i<iarr.length; i++){
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

        iarr[0] = 10;
        System.out.println("변경된 배열의 값 출력 : ");
        for(int i = 0; i<iarr.length; i++){
            System.out.print(iarr[i] + " ");
        }
        System.out.println();
    }
    public void testClassType(RectAngle rectAngle){
        System.out.println("매개변수로 전달받은 값 : " + rectAngle );
        System.out.println("사각형의 넓이와 둘레================================");
        rectAngle.calcArea();
        rectAngle.calcRound();

        rectAngle.setHeight(100);
        rectAngle.setWidth(100);
        System.out.println("변경후 사각형의 넓이와 둘레================================");
        rectAngle.calcArea();
        rectAngle.calcRound();

    }

    public void testVariablelengthAraary(String name, String ...hobby){
        //...hobby 이렇게 가변배열 가능
        System.out.println("이름 : " + name);
        System.out.println("취미의 갯수 : " + hobby.length);
        System.out.print("취미 : ");
        for(int i=0; i<hobby.length; i++){
            System.out.print(hobby[i]);
        }
        System.out.println();
    }
    /*public void testVariablelengthAraary(String ...hobby){
        //...hobby 이렇게 가변배열 가능
        System.out.println("취미의 갯수 : " + hobby.length);
        System.out.print("취미 : ");
        for(int i=0; i<hobby.length; i++){
            System.out.print(hobby[i]);
        }
        System.out.println();
    }*/
}
