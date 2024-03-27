package com.ohgiraffers.section3.copy;

public class Application2 {
    public static void main(String[] args) {
        /* 얇은 복사를 활용하여 매개변수와 리턴값으로 활용할 수 있다.
        *
        * 얕은 복사를 활용
        * 얕은 복사를 홯ㄹ용하는 것은 주로 메소드 호출시 인자로 사용하는 경우와
        * 리턴값으로 동일한 배열을 리턴해주고 싶은 경우 사용한다. */

        String[] name = {"홍길동","유관순", "이순신 "};
        System.out.println("hashcode : " + name.hashCode());//1283928880
        print(name);
        /* 1. 인자와 매개변수로 활용
        * */


        /* 2.리턴값으로 활용 */
        String[] animals = getAnimal();
        System.out.println("리턴받은 애니멀 해쉬코드" + animals.hashCode());
        print(animals);

    }
    public static void print(String[] sarr){
        System.out.println("sarr의해시코드 = " + sarr.hashCode());
        for(int i = 0; i < sarr.length; i++){
            System.out.println(sarr[i] + " ");
        }
        System.out.println();

    }
    public static String[] getAnimal(){
        String[] animals = new String[]{"뱀", "판다" , "다람쥐"};

        System.out.println("새로만든 animal의 hashcode" + animals.hashCode());
        return animals;
    }
}
