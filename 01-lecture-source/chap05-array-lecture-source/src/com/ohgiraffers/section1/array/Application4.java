package com.ohgiraffers.section1.array;

import java.util.Scanner;

public class Application4 {
    /* 5명의 자바 점수를 정수로 입력받아서 합계와 평균을 실수로 구하는 프로그램을 만드세요*/

    public static void main(String[] args) {
        int [] scores = new int[5];

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i< scores.length; i ++){
            System.out.println( (i + 1) + "번 째 학생의 자바점수를 입력해주세요 ");
            scores[i] = sc.nextInt();
        }

        double sum = 0.0;
        double avg = 0.0;

        for(int i = 0; i<scores.length; i++){
            sum += scores[i];

        }
        avg = sum / scores.length;
        System.out.println("평균은 "+ avg + "총합은 "+ sum + "입니다" );
    }
}
