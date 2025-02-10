package com.ise.petsim.animal;


import com.ise.petsim.animal.abs.type.AirAnimal;


public class Falcon extends AirAnimal {

    public Falcon() {
        super();
    }

    @Override
    public void train() {
        System.out.println(this.name + " is trained to hunt fish.");
    }

    @Override
    public void fly() {
        System.out.println(this.name + " is soaring through the sky.");
    }

    @Override
    public void makeSound() {
        System.out.println("Kree kree");
    }

}
