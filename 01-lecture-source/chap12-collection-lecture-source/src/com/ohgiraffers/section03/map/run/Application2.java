package com.ohgiraffers.section03.map.run;

import java.util.Properties;

public class Application2 {
    public static void main(String[] args) {
        /*
        * Properties란
        * HashMap을 구현하여 사용 용법이 거의 유사하지만 모두 문자열 사용할 수 있는 자료구조이다
        * 설정 파일의 값을 읽어서 어플리케이션에 적용할 때 사용한다.
        * */

        Properties prop = new Properties();

        prop.setProperty("driver","oracle.jdbc.driver.OracleDriver");
        prop.setProperty("url", "jdbc:oracle:thin:");
        prop.setProperty("user", "student");
        prop.setProperty("password", "student");
        System.out.println("prop = " + prop);


        System.out.println( prop.get("driver"));
        System.out.println( prop.get("url"));
        System.out.println( prop.get("user"));
        System.out.println( prop.get("password"));


        


    }
}
