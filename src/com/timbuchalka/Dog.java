package com.timbuchalka;

/**
 * Created by KH389659 on 26/09/2017.
 */
//Classe Dog extendendo a classe Animal (Herança), para pegar atributos e metodos da classe pai "Animal".
public class Dog extends Animal {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    //Construtor criado para trzer os atributos da classe pai "Animal" e as da propria classe.
    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        //Classe Animal
        super(name, 1, 1, size, weight);
        //Classe DOG
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    //Metodo Criado para Printar na tela que esta sendo chamado em algum outro metodo atraves de Herança.
    private void chew() {
        System.out.println("Dog.chew() called");
    }

    //Forma de Sobre escrever um metodo criado na classe pai no caso a "Animal", utiliza o metodo "EAT" de la com as funcionalidades necessaris na classe Dog.
    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        //insere o metodo Chew dentro do metodo eat
        chew();
        //chama o metodo da classe pai "Animal" para dentro da classe dog
        super.eat();
    }

    //Metodo criado para mostrar um valor ficticio e printar se o cachorro esta andando e a qual velocidade, herdando o metodo "MOVE" da classe pai
    public void walk() {
        System.out.println("Dog.Walk() called");
        //Chama o metodo Move da classe Pai "Animal"
        super.move(5);
    }

    //Metodo criado para mostrar um valor ficticio e printar se o cachorro esta andando e a qual velocidade, herdando o metodo "MOVE" da classe pai
    public void run() {
        System.out.println("Dog.Run() called");
        //Chama o metodo Move da classe Pai "Animal"
        super.move(10);
    }

    public void moveLegs(int speed) {
        System.out.println("Dog.MoveLegs() called");
    }

    //Forma de Sobre escrever um metodo criado na classe pai no caso a "Animal", utiliza o metodo "MOVE" de la com as funcionalidades necessaris na classe Dog.
    @Override
    public void move(int speed) {
        moveLegs(speed);
        super.move(speed);

    }
}

