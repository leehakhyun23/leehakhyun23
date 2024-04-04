package com.ohgiraffers.section01.list.run;

import java.util.*;

public class Application1 {
    public static void main(String[] args) {
        /* 컬렉션 프레임워크에 대해 이해할 수 있다. */
        /*
        * 컬렉션 프레임 워크
        * 자바에서 컬렉션 프레임워크는 여러 개의 다양한 데이터를 쉽고 효과적으로 처리할 수 있도록
        * 표준화된 방법을 제공하는 클래스의 집합을 의미한다.
        *
        * 컬렉션 프레임워크는 3가지 인터페이스 중 한가지를 상속받아 구현해놓았다.
        * 1. List 인터페이스
        * 2. Set 인터페이스
        * 3. Map 인터페이스
        *
        * List 인터페이스의 특징
        * 1. 순서가 있는 데이터 집합으로 데이터 중복 저장을 허용한다.
        * 2. Vector, ArrayList, LinkedList, Stack, Queue 등이 있다.
        * 3. 요소의 저장 순서가 유지된다.
        *
        * ArrayList
        *  배열의 단점을 보완하기 위해 만들어졌다.
        *  배열은 크기를 변경할 수 없고, 요소의 추가 삭제, 정렬등이 복잡하다는 단점을 가지고 있다.
        *  이러한 배열의 단점을 보완하고자
        *  크기 변경(새로운 더 큰 배열 만들고 옮기기), 요소의 추가, 삭제, 정렬 기능들을 미리 메소드로 구현해서 제공하고 있다.
        *
        * */

        ArrayList arrayList = new ArrayList();
        List list = new ArrayList();
        Collection collection = new ArrayList();

        arrayList.add("apple");
        arrayList.add(123); //값 > 객체로 오토박싱처리됌
        arrayList.add(new Date());

        System.out.println("arrayList = " + arrayList);

        arrayList.size();
        System.out.println("arrayList = " + arrayList.size());
        // ArrayList는 get()을 이용해서 꺼내며 size()로 요소의 갯수를 반환한다.
        for(int i =0; i< arrayList.size(); i++){
            System.out.println(i + " : " + arrayList.get(i));

        }


        arrayList.add("apple");
        System.out.println("arrayList = " + arrayList);

        arrayList.add(1, "Banana");
        System.out.println("arrayList = " + arrayList);

        arrayList.remove(2);

        System.out.println("arrayList = " + arrayList);

        /* 지정된 위치의 값을 수정할 때 인덱스를 활용할 수 있다. */
        arrayList.set(1, Boolean.valueOf(true));
        System.out.println("arrayList = " + arrayList);
        /* 모든 컬렉션 프레임워크 클래스는 제네릭 클래스로 작성되어있다. */
        List<String> str = new ArrayList<>();
        // 제너릭 타입을 지정하면 저장된 타입 외에는 인스턴스는 저장하지 못한다.
        str.add("apple");
        // str.add(123); 스트링으로 지정해줘서 안들어감
        str.add("banana");
        str.add("orange");
        str.add("mango");
        str.add("grape");
        System.out.println("str = " + str);

        // Collention 인터페이스가 아니고 클래스이다.
        // 인터페이스명에 s가 붙은 클래스는 관례상 비슷한 방식으로 작성된 클래스를 의미한다.
        Collections.sort(str);
        System.out.println("str = " + str);

        /*
        * 조금 복잡하지만 내림차순 정렬도 할 수 있다.
        * 하지만 기본적으로 ArrayList는 내림차순 기능을 제공하지 않는다.
        * 역순 정렬기능은 LinkedList에 포함되어 있는데, List로 공간을 선언했기 때문에
        * ArrayList에서 LinkedList로 변경할 수 있다.
        * */
        str = new LinkedList<>(str);


                
        
    }
}
