package com.ohgiraffers.section03.overriding;

public class SubClass extends SuperClass{

    /* 1. 메소드 이름을 변경하면 에러 발생 */

//    @Override
//    public void method2(int num) {
//    }

    /* 메소드의 리턴타입을 변경하면 에러 발생*/
//    @Override
//    public int method(int num) {
//        return 0;
//    }

    /* 매개변수 갯수나 타입을 변경하면 에러 발생
    @Override
    public void method(String num) {
    } */

    /*4. 메소드 이름, 리턴타입 매개변수의 갯수 ,타입, 순서가 일치할 경우 오버라이딩 성립*/
    @Override
    public void method(int num) {
        super.method(num);
    }
    /**/

    /* 5. private  메소드는 오버라이딩 불가 */
//    @Override
//    private void privateMethod(){}

    /* 6. 파이널 키워드는 안된다. */
//    @Override
//    public final void finalMethod(){}

//    @Override
//    void protectedMethod(){} // 좁은 범위라서 불가능

    @Override
    public void protectMethod() { } // 더 넓은 범위로도 가능

    // 참고로 클래스에도 final 키워드를 추가할 수 있는데 이는 상속을 제한하는 키워드이다. (클래스 활장 불가)


}
