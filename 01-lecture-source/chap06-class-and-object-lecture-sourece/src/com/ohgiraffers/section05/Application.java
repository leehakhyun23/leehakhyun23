package com.ohgiraffers.section05;

public class Application {
    public static void main(String[] args) {
        /* 메소드의 파라미터에 대해 이해하고 사용할 수 있다. */

        /*
        * 매개변수 로 사용 가능한 자료형
        * 1. 기본자료형
        * 2. 기본자료형 배열
        * 3. 클래스 자료형 (String)
        * 4. 클래스자료형 배열 (ex.String 배열)
        * 5. 가변인자 : 인자값 갯수가 정해지지 않은 경우 ex. 배열에 취미 넣었던거 ??
        * */

        /* 인스턴스 생성 */
        ParameterTest pt = new ParameterTest();
        /* 1. 기본자료형을 매개변수로 전달받는 메소드 호출확인*/
        int num  = 10;
        pt.testPrimaryType(num);

        /* 2, 기본자료형 배열을 매개변수로 전달받는 메소드 호출 확인 */
        int[] iarr = new int[]{1,2,3,4,5};
        System.out.println("인자로 전달하는 값 = " + iarr );
        pt.testPrimaryTypeArray(iarr);

        System.out.println("변경된 원본 배열의 값 출력 : ");
        for(int i = 0; i<iarr.length; i++){
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

        /* 3. 클래스 자료형 */
        RectAngle r1 = new RectAngle(12.5 , 22.5);
        System.out.println("인자로 전달하는 값 : " + r1);
        pt.testClassType(r1);

        System.out.println("변경후 === ");
        r1.calcArea();
        r1.calcRound();

        /* 클래스 자료형 배열은 뒤에서 다룬다. */

        /* 가변 인자 */
        pt.testVariablelengthAraary("홍길동 "); // 가변인자는 전달하지 않아도 됌
        pt.testVariablelengthAraary("유관순" , "볼링"); //1개도 가능
        pt.testVariablelengthAraary("이순신" , "볼링", "축구"," 농구"); //여러개도 가능
        pt.testVariablelengthAraary("심사임당" , new String[]{"테니스 ", "서예"}); //배열도 가능



    }

}
