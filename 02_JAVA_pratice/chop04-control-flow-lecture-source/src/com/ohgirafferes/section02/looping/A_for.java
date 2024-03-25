package com.ohgirafferes.section02.looping;
import java.util.Scanner;
public class A_for {
    public void testfor(){
        /* 수업목표 for 단독 사용에 대한 흐름 이해하고 적용할 수 있다. */
        /* for 문 표현식
        * for (초기식; 조건식 ; 증감식){
        *   조건을 만족하는 경우 수행할 구문(반복할 구문 )
        * }
        * */

        for (int i = 0; i <= 10; i++){
            System.out.println(i);
        }


    }
    public void Forexample(){
        Scanner sc = new Scanner(System.in);
        /*System.out.println("1번학생의 이름을 입력해주세요");
        String student1 = sc.nextLine();
        System.out.println("1번학생의 이름은 " + student1 + "입니다");
*/
        /* 반복해야하는 내용은?*/
        /*1. 학생의 이름을받아 변수에 저장
        * 2. 안내문구 출력
        * 3. 저장된이름 출력\
        * */
        /* 반복횟수 1~10까지 1씩 증가하여 총 10번을 반복하였다. */
        for (int i =1; i <= 10 ; i ++ ){
            System.out.println(i + "번학생의 이름을 입력해주세요");
            String student = sc.nextLine();
            System.out.println( i + "번째 학생의 이름은 " + student + "입니다.");

        }
    }
    public void Forexample2(){
        /* 문장 속에 규칙 찾기 */
        /* 1부터 10 까지 합계를 구하라
        *  */
        int result = 0;
        for(int k = 1; k <=10; k ++){
            result += k;
            System.out.println(result);

        }

    }
    public void Forexample3(){
        int random = (int) (Math.random() * 6) + 5;

        System.out.println("random : " + random);

        /* 뭔가 더해서 담기 위해 sum 변수를 0으로 초기화 */
        int sum = 0;

        /*
        if(random == 5) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
        } else if(random == 6) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
        } else if(random == 7) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
            sum += 7;
        } else if(random == 8) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
            sum += 7;
            sum += 8;
        } else if(random == 9) {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
            sum += 7;
            sum += 8;
            sum += 9;
        } else {
            sum += 1;
            sum += 2;
            sum += 3;
            sum += 4;
            sum += 5;
            sum += 6;
            sum += 7;
            sum += 8;
            sum += 9;
            sum += 10;
        }

        System.out.println("1부터 " + random + "까지의 합은 : " + sum);
        */
        int sum2 = 0;
        for(int i = 1 ; i<= random; i++){
            sum2 += i;
        }
        System.out.println("1부터 " + random + "까지의 합은 :" + sum2 );
    }
    public void printSimpleGugudan() {

        Scanner sc = new Scanner(System.in);
        System.out.println("단을 입력하세여");
        int dan = sc.nextInt();

        if(dan >= 2 && dan <= 9){
            for(int i = 1 ; i <= 9; i++){
                System.out.println(dan + " * " + i + " = " + dan*i) ;
            }
        }
        else{
            System.out.println("반드시 2~9 사이의 양수를 입력해야합니다.");
        }
        System.out.println("프로그램을 종료합니다.");


    }

}
