package com.ise.petsim.animal;


import com.ise.petsim.animal.abs.type.AirAnimal;


public class Parrot extends AirAnimal {

    public Parrot() {
        super();
    }

    @Override
    public void train() {
        System.out.println(this.name + " is trained to repeat your sentences.");
    }

    @Override
    public void fly() {
        System.out.println(this.name + " is flapping its wings.");
    }

    @Override
    public void makeSound() {
        System.out.println("Squawk squawk");
    }

}
