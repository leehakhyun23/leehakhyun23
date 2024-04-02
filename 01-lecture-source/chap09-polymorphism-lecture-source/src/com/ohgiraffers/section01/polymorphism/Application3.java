package com.ohgiraffers.section01.polymorphism;

public class Application3 {
    public static void main(String[] args) {
        /* 다형성을 적용하여 매개변수를 활용 할 수 있다.
        * 1. 하단에 feed() 메소드를 작성*/

        Application3 app = new Application3();

        Animal animel1 = new Rabbit();
        Animal animel2 = new Tiger();

        app.feed(animel1);
        app.feed(animel2);

        Rabbit animal3 = new Rabbit();
        Tiger animal4 = new Tiger();
        app.feed(animal3);
        app.feed(animal4); //묵시적 형변환이 일어난것

        app.feed((Animal) animal3);
        app.feed((Animal) animal4); //명시적 형변환이 일어난것

        app.feed(new Rabbit());
        app.feed(new Tiger());
    }
    public void feed(Animal animal){

        animal.eat();
    }
}
