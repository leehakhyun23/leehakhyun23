package com.ohgiraffers.section02.assignment;

public class Application1 {
    public static void main(String[] args){
        /* 수업목표 대입 연산자와 산술 복합 대입 연산자를 이해하고 활용할 수 있다.
        * 대입연산자와 산술복합 대입 연산자
        * '=' : 왼쪽에 피연산자에 오른쪽의 피연산자를 대입함
        * '+=' : 왼쪽에 피연산자에 오른쪽의 피연산자를 더한 결과를 왼쪽에 피연산자에 대입함
        * '-=' : 왼쪽에 피연산자에 오른쪽의 피연산자를 뺀 결과를 왼족에 피연산자에 대입함
        * '*=' : 왼쪽에 피연산자에 오른쪽의 피연산자를 곱한 결과를 왼족에 피연산자에 대입함
        * '/=' : 왼쪽에 피연산자에 오른쪽의 피연산자를 나눈 결과를 왼족에 피연산자에 대입함
        * '%=' : 왼쪽에 피연산자에 오른쪽의 피연산자를 나눈 나머지 결과를 왼족에 피연산자에 대입함
        * */

        int num = 12;

        System.out.println("num : " + num);

        num = num + 3;
        System.out.println("num : " + num);

        num += 3;
        System.out.println("num : " + num);

        num -= 5;
        System.out.println("num : " + num);

        num *= 2;
        System.out.println("num : " + num);

        num /= 2;
        System.out.println("num : " + num);

        num %= 3;
        System.out.println("num : " + num);

        /* 주의 사항
        * 산술 복합 대입연산자의 작성 순서에 주의해야한다.
        * */


    }
}
