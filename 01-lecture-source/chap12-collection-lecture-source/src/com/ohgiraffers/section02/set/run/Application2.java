package com.ohgiraffers.section02.set.run;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Application2 {
    public static void main(String[] args) {
        /*
        * LinkedHashSet 클래스
        * HashSet의 기능을 모두 가지고 있고 추가적으로 저장순서를 유지하는 기능을 하고 있다.
        * */

        LinkedHashSet<String> lset = new LinkedHashSet<>();
        lset.add("java");
        lset.add("oracle");
        lset.add("jdbc");
        lset.add("html");
        lset.add("css");

        System.out.println("lset = " + lset);
        
        TreeSet<String> tset = new TreeSet<>(lset);
        System.out.println("tset = " + tset);
        
        
    }
}
