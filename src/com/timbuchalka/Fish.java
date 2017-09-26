package com.timbuchalka;

/**
 * Created by KH389659 on 26/09/2017.
 */
public class Fish extends Animal {
    private int gills;
    private int eyes;
    private int fins;

    public Fish(String name, int size, int weight, int gills, int eyes, int fins) {
        super(name, 1, 1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest() {

    }

    public void moveMuscles() {

        System.out.println("Very Stronger Muscles");
    }

    public void moveBackFin() {

        System.out.println("Very Stronger Fins");

    }

    public void swim(int speed) {
        moveMuscles();
        moveBackFin();
        super.move(speed);
    }
}
