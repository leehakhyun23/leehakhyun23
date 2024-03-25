package com.ohgirafferes.section01.conditional;

import java.util.Scanner;

public class B_ifElse {
    public void elsetest() {
        /* 수업목표 if-else로 단독 사용에 대한 흐름을 이해하고 적용할 수 있다.
        * if- else 표현식
        * if(조건식){
        *   조건식이 true일 때 실행할 명령문
        * }
        * else {
        *   조건식이 false일 때 실행할 명령문
        * }
        * */
        /* if문은 조건식의 결과가 참이면 if{} 안에 코드를 실행하고
        * 조건식의 결과가 거짓이면 else {}안에 있ㄴ는 코드를 실향 */
        /* 정수 한개를 입력 받아 그 수가 홀수이면 "입력하신숫자는 홀수입니다." 를 출력하고
        * 홀수가 아니면 입력하신 숫자는 짝수입니다. 출력하기 */

        System.out.println("숫자를 한개 입력해주세여 ");
        Scanner cs =new Scanner(System.in);
        int a = cs.nextInt();
        if( a% 2== 1){
            System.out.println("입력하신 수는 홀수 입니다. ");
        }
        else{
            System.out.println(" 입력하신 수는 짝수 입니다.");
        }
        System.out.println("프로그램을 종료합니다 ");
    }

    public void testNeatedIfElse(){
        /* 중첩된 if else 문의 흐름을 이해하고 적용할수 있다. */
        /* 숫자를 하나 입력 받아 양수이면 " 입력하신 숫자는 양수입니다. 출력하고
        * 음수이면 "입력하신 숫자는 음숭비니다, 출력
        * 단 0이면 0입니다. 출력*/
        System.out.println("숫자를 한개 입력해주세여 ");
        Scanner cs =new Scanner(System.in);
        int a = cs.nextInt();
        if( a > 0){
            System.out.println("입력하신 수는 양수 입니다. ");
        }
        else{
            if( a == 0 ){
                System.out.println("입력하신 수는 0입니다. ");
            }
            else {
                System.out.println(" 입력하신 수는 음수 입니다.");
            }
        }
        System.out.println("프로그램을 종료합니다 ");
    }


}
