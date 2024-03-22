package com.ohgiraffer.section03.math;
import java.util.Random;
public class Application3 {
    public static void main(String[] args) {
        /* 수업목표. java.util.random
        *
        * java.util.Random 클래스
        * java.util.Random 클래스 nextInt()메소드를 이용한 난수 발생
        * nextInt(int bound) : 0부터 매개변수로 전달받은 정수 범위까지의 난수를 발생시켜서 정수 형태로 반환
        *
        * */
        /* random.nextInt(구하려는 난수의 갯수) + 구하려는 난수의 최소값 */

        Random random = new Random();
        /* 1. 0~9까지 난수발생 */
        int randomNum = random.nextInt(10);

        System.out.println("0부터 9까지 난수발생 " + randomNum);

        /* 2. 1부터 10까지 난수 발생 */
        int randomNum2 = random.nextInt(10) + 1;
        System.out.println("1부터 10까지 난수 : " + randomNum2);

        /* 3. 20부터 45까지 난수 발생 */
        int ran = random.nextInt(26) + 20;
        System.out.println("20부터 45 난수 발생 : " + ran);

        /* 4. -128~ 127 까지 난수 발생*/
        int randomNum4 =new Random().nextInt(256) -128;
        System.out.println(randomNum4);
    }
}
