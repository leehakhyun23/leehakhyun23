package com.ohgiraffers.section02.extend.run;

import com.ohgiraffers.section02.extend.Animal;
import com.ohgiraffers.section02.extend.Mammal;
import com.ohgiraffers.section02.extend.*;


import javax.swing.plaf.ButtonUI;

public class Application1 {
    public static void main(String[] args) {
        /* 수업 목표
        * extends 키워드를 이용하여 특정한 타입만을 사용하도록 제네릭 범위를 제한할 수 있다.*/
        // RabbitFarm<Animal> fram1 = new RabbitFarm<Animal>();
        //RabbitFarm<Mammal> fram2 = new RabbitFarm<Mammal>();
        //RabbitFarm<Snake> fram2 = new RabbitFarm<Snake>();

        RabbitFarm<Rabbit> farm4 = new RabbitFarm<>();
        RabbitFarm<Bunny> farm5 = new RabbitFarm<>();
        RabbitFarm<DrunkenBunny> farm6 = new RabbitFarm<>();
        //farm4.setAnimal(new Snake());
        farm4.setAnimal(new Rabbit());
        ((Rabbit)farm4.getAnimal()).cry();
        farm4.getAnimal().cry(); //형변환 생략가능

        farm5.setAnimal(new Bunny());
        farm5.getAnimal().cry();

        farm6.setAnimal(new DrunkenBunny());
        farm6.getAnimal().cry();


    }
}
