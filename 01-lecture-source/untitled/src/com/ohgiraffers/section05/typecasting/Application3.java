package com.ohgiraffers.section05.typecasting;

public class Application3 {
    public static void main(String[] args){
        /* 수업목표. 자동형변환과 강제형변환을 이용하여 서로 다른 자료형끼리 연산을 수행할 수 있다.

        자동 형변환과 강제 형변환을 이용한 다른 자료형끼리 연산
        다른 자료형끼리 연산은 큰 자료형으로 자동형변환 후 연산처리된다.
        * */

        int inum = 10;
        long lnum = 100;

        /* 목차 두 수의 연산 결과를 int형으로 연산 후 int 자료형 변수에 리턴받는다.*/

        int isum = (int)(inum + lnum);
        //int isum = inum + (int)lnum;
        //long isum = inum + lnum;
        // 주의사항 int 미만의 연산 처리의 결과는 int 형이다.
        byte bnum1 = 1;
        byte bnum2 = 2;
        short snum1 = 3;
        short snum2 = 4;

        // short snum = bnum1 + snum1;
        // byte bnum = bnum1 + bnum1;
        int result = bnum1 + bnum2;
        int result2 = snum1 + snum2;
    }
}
