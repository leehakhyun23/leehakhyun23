package com.ohgiraffer.section02;
import com.ohgiraffer.section01.method.Calculator;

import static com.ohgiraffer.section01.method.Calculator.maxNumberOf;
public class Appication2 {

    public static void main(String[] args) {
        /* 수업목표. 임포트 대해 이해할 수 있다. */
        /*
         * 임포트란?
         * 서로 다른 패키지에 존재하는 클래스를 사용하는 경우 패키지명을 포함한 풀 클래스 이름을 사용해야한다.
         * 하지만 매번 다른 클래스의 패키지명까지 기술하기에는 번거롭다.
         * 그래서 패키지명을 생략하고 사용할 수 있도록 한 구문이 import 문이다.
         * import는 패키지 선언문과 class선언문 사이에 작성하며
         * 어떠한 패키지 내에 클래스를 사용할 것인지 선언하는 효과를 가진다.
         * */
        Calculator cal = new Calculator();
        System.out.println(cal.minNumberOf(50,60));

        int a = Calculator.maxNumberOf(50,60);
        System.out.println(a);

        /* static 메소드를 호출할 때 클래스명을 생략하고 사용할 수 있다. */
        int max2 = maxNumberOf(100,200); //static import 메소드 수동추가
        System.out.println(max2);

    }
}