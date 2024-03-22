package com.ohgiraffer.section01.method;

public class Application1 {
    public static void main(String[] args){
        /* 수업목표. 메소드의 호출 흐름을 이해할 수 있다. */
        /*
        *  메소드란?
        *  메소드(method)는 이떤 특정 작업을 수행하기 위한 멍령문의 집합
        *
        *  메소드 사용목적
        *  1. 중복되는 코드를 메소드로 만들어 코드 반복사용을 피할 수 있다.
        *  2. 코드의 가독성이 좋아진다.
        *  3. 기능변경이 필요한 경우 메소드 부분만 수정하면 되기 때문에, 손쉬운 유지 보수가 가능하다.
        */

        System.out.println("main()시작됨..." );

        /* main method 밖에 하단에 methodA라는 메소드르 추가한다. */
        /* 2. 작성한 메소드를 호출하는 부분을 작성한다. */
        /*
        * 메소드의 호출방법
        * 클래스명 사용할 이름 = new 클래스명(); //객체생성
        * 사용할이름.메소드명(); //메소드호출
        * */

        Application1 app = new Application1();
        app.methodA();


        System.out.println("main() 끝..." );
    }

    // 뱀선생님 출근 표시
    public void methodA() {
        System.out.println(" 뱀 선생님 출근 ");
        methedB();
        System.out.println(" 뱀 선생님 퇴근 ");
    }

    // 뱀선생님 수업 일정
    public void methedB() {
        System.out.println("9시 30분에 수업을 시작합니다. ");
        methodC();
        System.out.println("6시 20분에 수업을 끝냅니다.");
    }


    //점심 먹어야지
    public void methodC(){
        System.out.println("점심시간 시작 1시 20분입니다.");
        System.out.println("점심시간 끝은 2시 30분입니다.");
    }


}
