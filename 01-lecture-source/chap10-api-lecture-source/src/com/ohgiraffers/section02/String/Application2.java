package com.ohgiraffers.section02.String;

public class Application2 {
    public static void main(String[] args) {
        /* 문자열 객체를 만드는 다양한 방법을 숙지하고 인스턴스가 생성되는
        * 방식을 이해할 수 있다.
        * 문자열 객체를 만드는 방법
        * "" 리터럴 형태 : 동일한 값을 가지는 인스턴스를 단일 인스턴스로 관리한다(singleton)
        * new String("문자열")
        * */

        String str1 = "java";
        String str2 = "java";
        String str3 = new String("java");
        String str4 = new String("java");

        System.out.println("Str1 == str2 " + (str1 == str2)); //str1,2 는 동일한 문자열 객체를 가르키고
        System.out.println("Str1 == str3 " + (str1 == str3)); //str3 는 생성한 객체를 가르킨다.
        System.out.println("Str4 == str3 " + (str4 == str3));

        /*
        * 값이 동일한 문자열 동일한 hashcode를 반환한다.
        * */

        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3.hashCode());
        System.out.println(str4.hashCode());

        str1 += "oracle";
        System.out.println("str1 == str2 : " + (str1==str2));
        /* equals() : String 클래스의 equals() 메소드는 인스턴스의 비교가 아니라 문자열 값을 비교하여
        * 동일한 값을 가지면 true, 다른값을 가지는 경우 false를 가지도록 Object equals() 메소드를
        * 재정의 해두었다.
        * 따라서 문자열 인스턴스 생성과 상관없이 동일한 문자열을 비교하기 위해서는 == 연산대신
        * equals 메소드를 사용해야한다. */

        System.out.println("str2.equals(str3) : " + str2.equals(str3));

    }
}
