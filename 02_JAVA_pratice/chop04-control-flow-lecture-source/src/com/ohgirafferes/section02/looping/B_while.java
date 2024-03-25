package com.ohgirafferes.section02.looping;

import java.util.Scanner;

public class B_while {
    /* 수업목표 while 문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다.*/
    /* while 표현식
    * 초기식;
    * while(조건식) {
    *   조건에 만족하는 경우 수행할 구문(반복할 구문);
    *   증감식 ;
    * }
    * */

    /* 1부타 10까지 1씩 증가시키면서 10면 i값을 출력하는 기본 반복문*/
    public void testSimpleWhileStatement(){
        int i = 1;
        while(i<=10){
            System.out.println( i );
            i ++;
        }
    }
    public void testwhile(){
        /* 입력한 문자열에 인덱스를 활용하여 문자 하나씩 출력해보자 */
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력 : ");
        String str = sc.nextLine();

        /*
        * charAt() : 문자열에서 인덱스에 해당 하는 문자를 char형으로 반환하는 기능
        * length() : String클래스의 메소드로 문자열의 길이를 int형으로 반환한다.
        * index() : 0부터 시작하고 마지막 인덱스는 항상 길이보다 한개 적은 숫자를 가진다. */
        int i = 0;
        while(i < str.length()){
            char ch = str.charAt(i);
            System.out.println(i + " : " +ch);
            i ++ ;
        }

    }
    public void testwhile2(){
        /* 중첩된 while 문의 흐름을 이해하고 적용할 수 있다. */
        /* while문으로 구구단 출력하기 */
        int dan = 2;
        while ( dan < 10 ){
            int su = 1;
            while (su < 10){
                System.out.println(dan + " * " + su + " = "+ dan *su );
                su++;
            }
            dan ++;
        }
    }

}
