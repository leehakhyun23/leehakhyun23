package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;
import com.ohgiraffers.section02.userexception.exception.NotEnoughMoney;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application2 {
    public static void main(String[] args) {
        ExceptionTest et = new ExceptionTest();
        try {
            et.checkEnoughMoney(20000,30000);
            //et.checkMoney(-20000,30000);
            System.out.println("정상동작 하니 ?");
        } catch (PriceNegativeException e) {

            System.out.println("PriceNegative 발생 ");
            System.out.println(e.getMessage());
        } catch (MoneyNegativeException e) {

            System.out.println("MoneyNegativeException 발생 ");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }catch (NotEnoughMoney e) {
            System.out.println("NotEnoughMoney 발생 ");
            System.out.println(e.getMessage());
        }finally {
            //예외 발생 여부와 상관없이 실행한다.
            System.out.println("finally 블럭 동작함");
        }
        System.out.println("프로그램을 종료합니다. ");
    }
}
