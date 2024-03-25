package com.ohgirafferes.section02.looping;

import java.util.Scanner;

public class A_nestedFor {

    public void printGugudan(){
        for(int dan = 2; dan < 10 ; dan++ ){
            for(int j = 1; j <=9; j++){
                System.out.print(dan + " *" + j +" = " + dan*j);
            }
        }
    }
    public void printUpgradeGugudanFromTwoToNine() {

        /* 수업목표. 중첩된 for문의 흐름을 이해하고 적용할 수 있다.(2) */
        /* 단을 2단부터 9단까지 하나씩 증가시킨다. */
        for(int dan = 2; dan < 10; dan++) {

            /* 설명. 한 단씩 구구단을 출력하는 메소드를 호출하며 인자로 단을 전달한다. */
            printGugudanOf(dan);
            /* 설명. 한 단을 출력하고 한 줄을 띄운다. */
            System.out.println();
        }

    }

    public void printGugudanOf(int dan) {

        /* 설명. 매개변수로 전달받은 단을 1 ~ 10까지 곱한 내용을 출력해준다. */
        for(int su = 1; su < 10; su++) {
            System.out.println(dan + " * " + su + " = " + (dan * su));
        }
    }

    public void printStarInput(){
        /*키보드로 정사 하나를 입력받아 해당정수만큼 한행에 *을 5개씩 출력하기  중첩된 for문을 이해하기 */

        Scanner sc = new Scanner(System.in);
        System.out.println(" 출력할 행의 수를 입력하세요 ");
        int a = sc.nextInt();
        for (int k =1 ; k<=a ; k ++) {
            for (int i = 1; i < 6; i++) {

                System.out.print("*");
            }
            System.out.println();
        }
    }

    public  void printTraiangle(){
        /* 정수를 입력하세요 : 5
        * *
        * **
        * ***
        * ****
        * *****
        *  */

        System.out.println("출력할 줄 수를 입력하세요");
        Scanner sc = new Scanner(System.in);
        int raw = sc.nextInt();

        for (int  i = 1 ; i <= raw ; i++){

            star(raw);


        }


    }
    public void star(int raw){
        for(int i = 1;  i<=raw; i++ ){
            System.out.print("*");
        }

    }


}


