package com.ohgiraffers.level01.basic;

public class Application2 {
    public static void main(String[] args) {
        int numOfApples = 92;
        int sizeOfBucket = 10;
        int numOfBucket = numOfApples / sizeOfBucket + (numOfApples % sizeOfBucket) > 0 ? 1 : 0 ;


        System.out.println("필요한 바구니의 수 : " + numOfBucket);
    }

}
