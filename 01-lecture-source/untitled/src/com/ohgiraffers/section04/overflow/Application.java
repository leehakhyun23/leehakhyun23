package com.ohgiraffers.section04.overflow;

public class Application {
    public static void main(String[] args){
        /* 수업목표. 오버플로우에 대해 이해 할 수 있다.
        * 자료형의 값의 최대 범위를 벗어나는 경우
        * 발생한 carry를 버림 처리하고 sign bit를 반전시켜 최소값으로 순환시킴
        * */

        /* 1. 오버플로우 */
        byte num1 = 127;

        System.out.println("num1 : " + num1);

        num1++;
        System.out.println("num1 오버플로우 : " + num1);

        byte num2 = -128;

        System.out.println("num2 : " + num2);

        num2--;
        System.out.println("num1 언더플로우 : " + num2);

        int firstNum = 1000000;
        int secondNum = 700000;

        int multi = firstNum * secondNum;
        System.out.println("firstNum * secondNum = " + multi );

        /* 3. 해결 방법 */
        /* 오버플로우를 예측하고 더 큰 자료형으로 자료형을 결과값을 받아서 처리한다.*/
        long longMulti = firstNum * secondNum;
        System.out.println("firstNum * secondNum = " + longMulti );


        long result = (long)firstNum + secondNum;
        System.out.println(result);



    }
}
