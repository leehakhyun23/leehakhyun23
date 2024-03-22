package com.ohgiraffer.section03.math;

public class Application2 {
    public static void main(String[] args) {
        /* 사용자 지정범위 난수를 발생 시킬 수 있다. */
        /* 난수의 활용
        * Math.random()을 이용해 발생하는 난수는 0부터 1전 까지의 실수 범위의 난수값을 반환한다.
        * 필요에 따라 정수 형태의 값을 원하는 범위만큼 발생시켜야 하는 경우도 존재한다.
        * */
        /* 원하는 범위의 난수를 구하는 공식
        * (int)(Math.random * 구하려는 난수의 갯수) + 구하려는 난수의 최소값 */

        /* 1. 0~9 까지 난수 발생*/
        int random1 = (int)(Math.random() * 10) ;
        System.out.println("난수 " + random1);

        /* 2. 1~10 까지의 난수 발생 */
        int random2 = (int)(Math.random() * 10 ) + 1 ;
        System.out.println(random2);

        /* 3. 10~15 까지의 난수 발생 */
        int random3 = (int)(Math.random() * 6) + 10;
        System.out.println("10부터 15사이의 난수 : " + random3);


    }
}
