package com.ohgiraffer.section01.method;

public class Application5 {
    public static void main(String[] args) {
        /* 수업목표. 메소드 리턴에 대해 이해할 수 있다.
        * return 이란?
        * ㅁ모든 메소드 내부에는 리턴이 존대한다.
        * void 메소드의 경우는 리턴을 명시하지않아도 마지막줄에 컴파일러가 추가해준다.
        * return은 현재 메소드를 강제 종료하고 호출한 구분으로 돌아가는 명령어이다. */


        System.out.println("main 메소드 시작함");
        /* 1.메소드 리턴 테스트 */
        Application5 app5 = new Application5();


        System.out.println("main 메소드 끝남");
    }
    public void testMethod(){

        System.out.println("테스트 메소드 동작 확인 ... ");
        /* 컴파일러에 의해 자동으로 추가되는 구문이다.
        가장 마지막 작성하고, 마지막에 작성되지않는 경우 컴파일 에러 발생시킨다.
        * */

        return; //에러 발생
    }

}
