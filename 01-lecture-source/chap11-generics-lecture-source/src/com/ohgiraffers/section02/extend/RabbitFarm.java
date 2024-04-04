package com.ohgiraffers.section02.extend;

//public class RabbitFarm<T implements Animal> { 에러남
//public class RabbitFarm<T extends Animal> { //정상
public class RabbitFarm<T extends Rabbit>{
//public class RabbitFarm<T extends Rabbit & Animal> {
//public class RabbitFarm<T extends Rabbit & Animal> {
//public class RabbitFarm<T extends Rabbit , Snake> {

    private T animal;
    public RabbitFarm(){}

    public RabbitFarm(T animal){
        this.animal = animal;
    }

    public T getAnimal() {
        return this.animal;
    }

    public void setAnimal(T animal) {
        this.animal = animal;
    }
}
