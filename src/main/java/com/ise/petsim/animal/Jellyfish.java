package com.ise.petsim.animal;


import com.ise.petsim.animal.abs.type.WaterAnimal;


public class Jellyfish extends WaterAnimal {

    public Jellyfish() {
        super();
    }

    @Override
    public void train() {
        System.out.println(this.name + " is trained to swim and sting.");
    }

    @Override
    public void swim() {
        System.out.println(this.name + " is pulsing through the water.");
    }

    @Override
    public void makeSound() {
        System.out.println("Gloop gloop");
    }

}
