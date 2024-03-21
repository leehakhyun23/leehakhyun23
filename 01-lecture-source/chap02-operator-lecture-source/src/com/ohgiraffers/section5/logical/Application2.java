package com.ohgiraffers.section5.logical;

public class Application2 {
    public static void main(String[] args){
        /*수업목표. 논리 연산자의 우선순위에 대해 이해하고 이를 활용할 수 있다.
        * 논리 연산자의 우선순위와 활용
        * && : 11순위
        * || : 12순위
        * 논리 and 연산자 순위가 논리 or 우선순위보다 높다
        * */

        /* 1. 1부터 100 사이의 값인지 확인
        *  1<= 변수 and 변수 <= 100 */
        int num1 = 55;
        System.out.println("1부터 100 사이인지 확인 : " + (num1 >= 1  && num1 <= 100));

        int num2 = 166;
        System.out.println("1부터 100 사이인지 확인 : " + (num2 >= 1  && num2 <= 100));
    }

}
