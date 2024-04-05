package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoney;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application3 {
    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();

        try{
            et.checkEnoughMoney(20100,3000);
        } catch (PriceNegativeException | MoneyNegativeException e){
            // 예외가 발생한 클래스의 이름을 알 수 있다.
            System.out.println(e.getClass() + "발생 ");
            System.out.println(e.getMessage());
        }catch (NotEnoughMoney e){
            e.printStackTrace();

        }finally {
            System.out.println("finally 블럭 동작함");
        }
        System.out.println("프로그램이 종룓횀");


    }
}
