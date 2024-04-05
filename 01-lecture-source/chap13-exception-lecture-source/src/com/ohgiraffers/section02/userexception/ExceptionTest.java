package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.MoneyNegativeException;

import com.ohgiraffers.section02.userexception.exception.NotEnoughMoney;
import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class ExceptionTest {
    //public void checkMoney(int price , int money) throws PriceNegativeException,MoneyNegativeException , NotEnoughMoney {
    public void checkEnoughMoney(int price , int money) throws PriceNegativeException,MoneyNegativeException , NotEnoughMoney /*Exception*/ {
        if(price < 0){
          throw new PriceNegativeException("상품 가격은 음수 일 수 없습니다.");
        }
        if(money < 0){
            throw new MoneyNegativeException("가진 돈이 음수 일 수 없습니다");
        }

        if(money < price){
            throw new NotEnoughMoney("가진돈 보다 상품 가격이 더 비쌉니다.");
        }

        System.out.println("가진돈이 충분합니다");
    }
}
