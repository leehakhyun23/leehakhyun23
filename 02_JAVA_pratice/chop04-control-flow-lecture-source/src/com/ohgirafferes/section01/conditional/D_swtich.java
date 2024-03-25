package com.ohgirafferes.section01.conditional;
import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;
public class D_swtich {

    public void switch1(){

        /* 수업목표. switch문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        /* switch문 표현식
         * switch(비교할변수){
         *   case 비교값 1 : 비교값과 일치할 경우 실행할 구문: break;
         *   case 비교값 2 : 비교값과 일치할 경우 실행할 구문: break;
         *   default : case 에 모두 해당 하지 않을 경우 실행할 구문 ㅣ
         * }*/

        /* 여러 개의 비교값 중 일치하는 조건에 해당하는 로직을 실행하는 것은 if-else - if 와 유사하다
         * 따라서 일부 호환이 가능하다
         * 하지만 switch문으로 비교 가능한 값은 정수, 문자, 문자열 형태의 값이다.
         * 실수와 논리는 비교할 수 없다.
         * 또한 정확하게 일치하는 경우만 비교할 수 있으며 대소 비교를 할 수 없다는 것이 차이점이다.
         * case 절에는 변수를 사요하지 못한다(값만 비교가능 )
         * 또한, 문자열 비교는 jdk 1.7 이상부터 가능하다
         *
         * */

        /* 정수 두 개와 연산 기호 문자를 입력 받아서
         * 두 숫자의 연산 결과를 출력해보는 간단한 계산기 만들기
         *  */

        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수 입력 : ");
        int fnum = sc.nextInt();
        System.out.print("두번째 정수 입력 ");
        int snum = sc.nextInt();
        sc.nextLine();
        System.out.println("연산 기호 입력 (+,-,/,%) : ");
        char op = sc.nextLine().charAt(0);

        int result = 0;
        switch(op){
            case '+' :
                result =fnum + snum;
                break;
            case '/' :
                result =fnum / snum;
                break;
            case '-' :
                result =fnum - snum;
                break ;
            case '*' :
                result =fnum * snum;
                break ;
            default:
                System.out.println("다시 입력하쇼");
        }
        System.out.println("값은 : " + result);
    }
    public void testMachine(){


        /* 수업목표 switch문 내에 break 문에 대해 흐름을 이해하고 적용할 수 있따.
        * switch 문을 이용하여 문자열 값 비교 및 break 테스트
        *
        * 1.jdk 1.7 이상부터 switch문을 사용하여 문자열을 비교할 수 있따.
        * break 사용하지 않으면 실행구문을 계속 동작시킨다. */
        System.out.println("=== OhGiraffers vending machine ===");
        System.out.println("  사이다   콜라   환타   박카스  핫식스  ");
        System.out.println("==============================");
        System.out.print("음료를 선택해주세요 : ");

        /*  원하는 음료를 문자열로 입력받음 */
        Scanner sc = new Scanner(System.in);
        String selectedDrink = sc.nextLine();


        int price = 0;


        switch(selectedDrink) {
            case "사이다" :
                System.out.println("사이다를 선택하셨습니다.");
                price = 500;
            case "콜라" :
                System.out.println("콜라를 선택하셨습니다.");
                price = 600;
            case "환타" :
                System.out.println("환타를 선택하셨습니다.");
                price = 700;
            case "박카스" :
                System.out.println("박카스를 선택하셨습니다.");
                price = 2000;
            case "핫식스" :
                System.out.println("핫식스를 선택하셨습니다.");
                price = 10000;
        }

        System.out.println(price + "원을 투입해주세요!");

        System.out.println("--------------개선된 자판기 --------------------");
        String order = "";
        switch(selectedDrink) {
            case "사이다" :
                order = "사이다";
                price = 500;
                break;
            case "콜라" :
                order = "콜라";
                price = 600;
                break;
            case "환타" :
                order = "환타";
                price = 700;
                break;
            case "박카스" :
                order = "박카스";
                price = 2000;
                break;
            case "핫식스" :
                order = "핫식스";
                price = 10000;
                break;
        }

        System.out.println(order + "를 선택하셨습니다.");
        System.out.println(price + "원을 투입해주세요!");


    }
}
