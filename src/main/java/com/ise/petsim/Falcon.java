package com.ise.petsim;

public class Falcon extends AirAnimal{
    public Falcon() {
        super();
    }
    
    @Override
    public void train() {
        System.out.println(this.getName() + " is trained to hunt fish.");
    }

    @Override
    public void fly() {
        System.out.println(this.getName() + " is soaring through the sky.");
    }

    @Override
    public void makeSound() {
        System.out.println("Kree kree");
    }
}
