package com.ohgirafferes.section3.branching;

public class B_continue {

    /* 수업목표. continue 문은 반복문 내에서 사용한다
    * 해당 반복문의 반복 회차를 중간에 멈추고 다시 증감식으로 넘어가게 해준다
    * 해당 반복문의 반복 회차를 중간에 멈추고 다시 증감식으로 넘어가게 해준다
    * 일반적으로 if(조건식){continue;} 처럼 사용한다.
    * 보통 반복문 내에서 특정 조건에 대한 예외를 처리하고자 할 때 사용한다. */

    public void testcon(){
        //1부터 100사이의 4의 배수이면서 5의 배수인 값을 출력
        for(int i = 0; i <= 100; i++){
            if(i % 4 != 0 || i % 5 != 0){

                continue;
            }
            System.out.println(i);
        }
    }
}
