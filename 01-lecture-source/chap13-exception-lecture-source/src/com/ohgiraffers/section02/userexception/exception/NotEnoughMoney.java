package com.ohgiraffers.section02.userexception.exception;

public class NotEnoughMoney extends Exception{
    public NotEnoughMoney() {
    }

    // 문자열을 부모 생성자쪽으로 전달하여 초기화하는 생성자
    public NotEnoughMoney(String message) {
        // 예외 인스턴스 생성 시점에서 예외 메세지를 부모 생성자쪽으로 전달해서 인스턴스를 생성하는 것
        super(message);
    }
}
