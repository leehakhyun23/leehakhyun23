package com.ohgirafferes.section01.polymorphism;

public class Application4 {
    public static void main(String[] args) {
        /* 다형성을 적용하여 리턴타입을 활용할 수 있다.
        * 1. getRandomAnimal() 추가 */
        /* 2. getRandomAnimal() 추가 */
        Application4 app = new Application4();

        Animal randomAnimal = app.getRandomAnimal();
        randomAnimal.cry();
    }
    public Animal getRandomAnimal(){
        int random = (int)(Math.random()*2);

        return random == 0 ? new Rabbit() : new Tiger();
    }
}
