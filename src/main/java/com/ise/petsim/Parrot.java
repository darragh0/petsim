package com.ise.petsim;

public class Parrot extends AirAnimal{
    public Parrot() {
        super();
    }
    
    @Override
    public void train() {
        System.out.println(this.getName() + " is trained to repeat your sentences.");
    }

    @Override
    public void fly() {
        System.out.println(this.getName() + " is flapping its wings.");
    }

    @Override
    public void makeSound() {
        System.out.println("Squawk squawk");
    }
}
