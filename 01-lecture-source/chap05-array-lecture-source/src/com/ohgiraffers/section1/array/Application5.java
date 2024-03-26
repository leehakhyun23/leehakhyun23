package com.ohgiraffers.section1.array;

import java.util.Random;

public class Application5 {
    public static void main(String[] args) {
        /* 랜덤한 카드를 한장 뽑아서 출력해보자 */
        int ran = (int)(Math.random()*13);
        String[] cardNumbers = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "JACK", "QUEEN", "KING", "ACE"};
        System.out.println(cardNumbers[ran]);
    }
}
