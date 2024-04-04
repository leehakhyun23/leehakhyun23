package com.greedy.level01.basic.member.run;

import com.greedy.level01.basic.member.model.vo.MemberVO;

public class Application {
    public static void main(String[] args) {
        MemberVO a = new MemberVO();
        System.out.println("Id = " + a.getId());
        System.out.println("pwd = " + a.getPwd());
        System.out.println("name = " + a.getName());
        System.out.println("age = " + a.getAge());
        System.out.println("gender = " + a.getGender());
        System.out.println("phone = " + a.getPhone());
        System.out.println("email = " + a.getEmail());

        a.setId("user01");
        a.setPwd("pass01");
        a.setName("홍길동");
        a.setAge(20);
        a.setGender('M');
        a.setPhone("010-1234-5678");
        a.setEmail("hong123@greedy.com");

        System.out.println("변경 후 Id = " + a.getId());
        System.out.println("변경 후 pwd = " + a.getPwd());
        System.out.println("변경 후 name = " + a.getName());
        System.out.println("변경 후 age = " + a.getAge());
        System.out.println("변경 후 gender = " + a.getGender());
        System.out.println("변경 후 phone = " + a.getPhone());
        System.out.println("변경 후 email = " + a.getEmail());

    }
}
