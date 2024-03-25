package com.ohgirafferes.section01.conditional;

import java.util.Scanner;

public class C_ifElseif {
    /* 수업목표 if - else - if 문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다.
    *
    * if else if 문 표현식
    * if(조건식1){
    *   조건식 1이 참일때 실행할 명령문
    * }
    * else if (조건식 2 ) {
    *   조건식 2이 참일때 실행할 명령문
    * }
    * else {
    * }
    * */
    public void testIfElseIf(){
        System.out.println("산 속에 나무를 하던 나무꾼이 연못에 도끼를 빠트리고 말았다.");
        System.out.println("연못에서 산신령이 나타나 금도끼, 은도끼, 쇠도끼를 들고 나타났다.");
        System.out.println("나무꾼한테 어떤 도끼가 나무꾼의 도끼인지 물어봤다.");
        System.out.println(" 1. 금도끼 2.은도끼 3.쇠도끼 : ");
        Scanner sc = new Scanner(System.in);
        int answer = sc.nextInt();

        if(answer == 1){
            System.out.println(" 거짓말 쟁이");
        }
        else if(answer == 2) {
            System.out.println(" 거짓말 쟁이 222");
        }
        else{
            System.out.println(" 정직하구만~ 도끼 3개다 가져라! ");
        }

        System.out.println(" 산신령은 가야합니다. ");

    }

    public void testNestedIfElse(){
        /* 수업목표 중첩된 if-else-if 문의 흐름을 이해하고 적용할 수 있다.*/
        /*중첩된 if-else-if문 실행흐름 확인 */
        /*
         *  ohgiraffers 대학의 김xx교수님은 학생들 시험 성적을 수기로 계산해서 학점 등급을 매기는 채점방식을 사용하고 있었다.
         *  90점 이상이면 'A', 80점 이상이면 'B', 70점 이상이면 'C', 60점 이상이면 'D'를
         *  60점 미만인 경우에는 'F'를 학점 등급으로하는 기준이다.
         *  추가로 각 등급의 중간점수(95, 85, 75..)인 경우 '+'를 붙여서 등급을 세분화 하다보니 신경쓸게 이만 저만이 아니다.
         *  그래서 학생의 이름과 점수를 입력하면 자동으로 학점 등급이 계산되는 프로그램을 만들기로 했다.
         * */

        Scanner sc = new Scanner(System.in);
        System.out.println(" 이름과 점수를 입력해주세요 ! ");

        String name = sc.nextLine();
        int num =  sc.nextInt();
        String grade;
        if(num >= 90 ){
            if(num>= 95){
                grade = "A+";
            }
            else{
                grade = "A";
            }
        }
        else if(num >= 80) {
            if(num >= 85){
                grade = "B+";
            }
            else{
                grade = "B";
            }
        }
        else if(num >= 70) {
            if(num >= 75){
                grade = "C+";
            }
            else{
                grade = "C";
            }
        }
        else if(num >= 60) {
            if(num >= 65){
                grade = "D+";
            }
            else{
                grade = "D";
            }
        }
        else{
            grade = "F";
        }
        System.out.println("이름:" + name + " 점수: " + num + " 성적은 " + grade + "입니다.");



    }



}
