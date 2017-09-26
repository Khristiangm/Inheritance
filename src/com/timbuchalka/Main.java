package com.timbuchalka;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Fish fish = new Fish("Fish",5,20,2,2,2);
        Dog dog = new Dog("Neca", 20, 20, 2, 4, 1, 30, "long silky");

//        dog.eat();

//        dog.move(5);
//        dog.move(10);

//        dog.walk();
//        dog.run();
//        dog.move(35);
        fish.swim(25);
    }
}
