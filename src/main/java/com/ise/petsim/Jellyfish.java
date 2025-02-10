package com.ise.petsim;

public class Jellyfish extends WaterAnimal {
    public Jellyfish() {
        super();
    }

    @Override
    public void train() {
        System.out.println(this.getName() + " is trained to swim and sting.");
    }

    @Override
    public void swim() {
        System.out.println(this.getName() + " is pulsing through the water.");
    }
    
    @Override
    public void makeSound() {
        System.out.println("Gloop gloop");
    }
}
