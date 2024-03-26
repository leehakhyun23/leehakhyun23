package com.ohgiraffers.section2.demensinal;

public class Application1 {
    public static void main(String[] args) {
        /* 다차원 배열의 구조를 이해하고 사용할 수 있다.*/
        /*
        * 다차원 배열
        * 다차원 배열은 2차원 이상의 배열을 의미한다.
        * 배열의 인덱스마다 또 다른 배열의 주소를 보관하는 배열을 의미한다
        * 즉, 2차원 배열은 1차원 배열 여러개를 하나로 묶어서 관리하는 배열을 의미한다
        * 더 많은 차원의 배열을 사용할 수 있지만 일반적으로 2차원 배열보다 높은 차원의 배열은 사용빈도가
        * 현저히 적다
        * */
        /*
        * 2차원 배열을 사용하는 방법
        * 1. 배열의 주소를 보관할 레퍼런스 변수 선언
        * 2. 여러개의 1차원 배열의 주소를 관리할 배열을 생성
        * 3. 각 인덱스에 관리하는 배열을 할당(heap)하여 주소에 보관하는 배열에 저장
        * 4. 생성한 여러개의 일차원배열에 차례로 접근해서 사용 */

        /* 1. 배열의 주소를 보관할 래퍼런스 변수 선언*/
        int[][] iarr1;
        int iarr2[][];
        int[] iarr3[];

        /*2. 여러개의 1차원 배열의 주소를 관리하는 배열을 생생
        * heap에 공간을 할당할 대 new연산자를 이용한다.
        * 배열의 주소를 관리하는 길이는 앞부분에 정수형으로 표기하며 반드시 크기를 지정해줘야한다.
        * */

        //iarr1 = new int[][]; // 크기를 지정하지 않으면 에러가 발생한다.
        // = new int[][5]; // 주소를 묶어서 관리할 배열의 크기를 저장하지 않으면 에러 발생
        iarr1 = new int[3][]; //이건 가능


        /* 3. 주소를 관리하는 배열의 인덱스마다 배열을 할당한다.*/
        iarr1[0] = new int[5];
        iarr1[1] = new int[5];
        iarr1[2] = new int[5];
        iarr2 = new int[3][5];

        /* 4-1 배열을 하나씩 접근해서 출력하기 */
        for(int i = 0; i<iarr1[0].length; i++){
            System.out.println(iarr1[0][i] + " " );
        }
        for(int i = 0; i<iarr1[1].length; i++){
            System.out.println(iarr1[1][i] + " " );
        }
        for(int i = 0; i<iarr1[2].length; i++){
            System.out.println(iarr1[2][i] + " " );
        }

        int iarr4[][] = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        for(int i = 0 ; i<iarr4.length; i++){
            for(int j = 0; j<iarr4[0].length; j++){
                System.out.print(iarr4[i][j] + " ");
            }
            System.out.println();
        }
    }
}
