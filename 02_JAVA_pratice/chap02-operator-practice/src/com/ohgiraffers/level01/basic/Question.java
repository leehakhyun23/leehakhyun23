package com.ohgiraffers.level01.basic;

public class Question {

    public static void main(String[] args) {

/*
        true  // y는 5이기 때문에 or 는 앞에 것이 true 그냥 true다.
        13 // y =15 x =2 여서 13이 되고 x의 값은 3이 된다.
        5 // 윗줄에서 x = 3 이 됐기때문에 2를 더하면 5가 된다.
        false = c는 'A' 이기 때문에 앞의 조건은 참.아스키코드상 Z가 A보다 크므로 참.둘다 참인데 !가 있으니까 false가 출력된다,.
        2 // 'C' = 067 char = 'A'인데 065 이기 때문에
        5 // 5-0 =  5
        66 // c는 065 + 1  하면 66
        67 // 66에서 ++을 먼저 연산하고 출력하므로 67이 되었다.
        67 // 출력 값은 67인데 ++로 인해 이젠 c가 1이 증가한 68이 되었다.
        68 // 위에서 68이 된상태*/


        /* Application02
         *
         * 내가 가지고 있는 사과의 갯수는 92개이다.
         * 이를 담을 수 있는 바구니에는 10개의 사과를 담을 수 있다면 총 10개의 바구니가 필요할 것이다.
         * 아래에 알맞은 코드를 넣으시오.
         *
         * int numOfApples = 92;
         * int sizeOfBucket = 10;
         * int numOfBucket = ?
         *
         * System.out.println("필요한 바구니의 수 : " + numOfBucket); -> 10
         */
        int numOfApples = 92;
        int sizeOfBucket = 10;
        int numOfBucket = numOfApples / sizeOfBucket + 1;


        System.out.println("필요한 바구니의 수 : " + numOfBucket);

    }

}