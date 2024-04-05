package com.ohgiraffers.section03.map.run;

import java.util.Date;
import java.util.HashMap;

public class Application1 {
    public static void main(String[] args) {
        /*
        * Map 인터페이스의 특징
        * Collection 인터페이스와 다른 저장방식을 가진다.
        * 키(Key)와 값(value)를 하나의 쌍으로 저장하는 방식을 사용한다.
        * */
        /*
        * 키(Key)란?
        * 값(value)를 찾기 위한 이름 역할을 하는 객체를 의미한다.
        * 1. 요소의 저장순서를 유지하지않는다.
        * 2. 키는 중복저장을 허용하지 않지만 키가 다르면 중복되는 값을 저장할 수 있다.
        * */

        // HashMap은 검색속도가 매우 빠르다.

        HashMap h = new HashMap();
        h.put("one" , new Date()); //자동박싱
        h.put(12,"red apple");
        h.put(33, 123);

        System.out.println("h = " + h);

        h.put(12, "banana");
        System.out.println("h = " + h);

        h.put(11, "banana");
        h.put(9, "banana");
        System.out.println("h = " + h);

        System.out.println("키 9의 객체값 = " + h.get(9));
        h.remove(9);
        System.out.println("h = " + h);
        System.out.println(h.size());
    }
}
