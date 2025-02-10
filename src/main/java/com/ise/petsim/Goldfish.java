package com.ise.petsim;

public class Goldfish extends WaterAnimal {
    public Goldfish() {
        super();
    }

    @Override
    public void train() {
        System.out.println(this.getName() + " is trained to swim through hoops.");
    }

    @Override
    public void swim() {
        System.out.println(this.getName() + " is swimming gracefully.");
    }

    @Override
    public void makeSound() {
        System.out.println("Blub blub");
    }
}
