package com.ohgiraffers.section2.demensinal;

public class Application2 {
    public static void main(String[] args) {
        /* 2차원 정변배열을 선언 및 할당하여ㅓ 사용할 수 있따.*/
        /*1. 배열의 선언 및 할당
        * 정변 배열의 경우 각 인덱스별 배열을 따로 할당 할수도 있지만 선언과 동시에 모든배여릉ㄹ
        * 할당할 수 있따.
        * 자료형[][] 변수병 = new 자료형[할당할 배열의 개수][할당할 배열의 길이]*/

        int[][] iarr = new int[3][5];
        iarr[0][0] = 1;
        iarr[0][1] = 2;
        iarr[0][2] = 3;
        iarr[0][3] = 4;
        iarr[0][4] = 5;

        iarr[1][0] = 6;
        iarr[1][1] = 7;
        iarr[1][2] = 8;
        iarr[1][3] = 9;
        iarr[1][4] = 10;

        iarr[2][0] = 11;
        iarr[2][1] = 12;
        iarr[2][2] = 13;
        iarr[2][3] = 14;
        iarr[2][4] = 15;


        System.out.print(iarr[0][0] + " ");
        System.out.print(iarr[0][1] + " ");
        System.out.print(iarr[0][2] + " ");
        System.out.print(iarr[0][3] + " ");
        System.out.print(iarr[0][4] + " ");

        System.out.println();

        System.out.print(iarr[1][0] + " ");
        System.out.print(iarr[1][1] + " ");
        System.out.print(iarr[1][2] + " ");
        System.out.print(iarr[1][3] + " ");
        System.out.print(iarr[1][4] + " ");

        System.out.println();

        System.out.print(iarr[2][0] + " ");
        System.out.print(iarr[2][1] + " ");
        System.out.print(iarr[2][2] + " ");
        System.out.print(iarr[2][3] + " ");
        System.out.print(iarr[2][4] + " ");

        System.out.println();
        /* 2. 각 배열의 인덱스에 접근해서 값 대입 후 출력 */
        /* 2-1 각 인덱스 공간에 하나씩 접근하여 값 대입 후 출력 */

        /* 2-2 반복문을 이용한 값 대입 후 출력 */
        int[][] iarr1 = new int[3][5];
        int value = 1;
        for(int i = 0; i < iarr1.length; i++ ){
            for(int k = 0; k < iarr1[0].length; k++){
                iarr1[i][k] = value;
                System.out.println("iarr1["+ i + "]["+ k +"]는 = " + value);
                value++;
            }
        }
    }
}
