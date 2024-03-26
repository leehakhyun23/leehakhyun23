package com.ohgiraffers.section1.array;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        /* 배열의 사용 방법 익히기 */
        /* 배열의 사용방법
        * 1. 배열의 선언
        * 2. 배열의 할당
        * 3. 배열의 인덱스 공간에 값 대입*/

        /* 배열의 선언
        * 자료형[] 변수명;
        * 자료형 변수명[]*/


        /*선언은 stack에 배열의 주소를 보관할 수 있는 공간을 만드는 것이다.
        *  */
        int[] iarr;
        char carr[];

        /* 선언한 레퍼런스 변수에 배열을 할당하고 대입할 수 있다.
        * new 연산자는 heap 영역에 공간을 할당하고 발생한 주소값을 반환하는 연산자이다.
        * 발생한 주소를 래퍼런스변수에 저장하고 이것을 참조하고 사용하기 때문에 참조자료형이라고 한다.
        * */
        /* 배열 할당 시에는 반드시 배열의 크기를 지정해줘야한다. */
        //iarr = new int[]; // 크기를 지정해주지 않아서 에러발생
        /* heap 메모리는 이름으로 접근하는 게 아니라 주소로 접근하는 영역이다.
         * stack에 저장된 주소로 heap 에 할당된 배열을 찾아갈 수 있다.
         * */


        iarr = new int[5];
        carr = new char[10];

        int[] arr2 = new int[5];
        char carr2[] = new char[10];



        System.out.println("arr2 = " + arr2); //16진수 주소값
        System.out.println("carr = " + carr2); //16진수 주소값

        System.out.println("arr2 = " + arr2.hashCode());
        System.out.println("carr = " + carr2.hashCode());

        /*
        hashcode() : 일반적으로 객체의 주소값을 10 진수로 변환하여 생성된 객체의 고유한 정수값을 반환한다
        동일객체인지 비교할 때 사용할 목적으로 쓰이며 동등 객체를 동일 갳게 취급하기 위해 오버라이딩해서 사용한다.
        */
        System.out.println(arr2.length);
        Scanner sc = new Scanner(System.in);
        System.out.println(" 새로 할당할 배열의 길이를 입력하세요 : ");
        int size = sc.nextInt();
        double darr[] = new double[size];
        System.out.println("darr의 해시코드 : "+ darr.hashCode()); //51228289
        System.out.println("darr의 길이 " + darr.length);
        darr = new double[30];
        System.out.println("변경후 darr의 해시코드 : "+ darr.hashCode()); //455896770
        System.out.println("변경후 darr의 길이 " + darr.length);



    }
}
