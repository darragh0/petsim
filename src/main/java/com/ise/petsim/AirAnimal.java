package com.ise.petsim;

public abstract class AirAnimal extends LeggedAnimals {
    public AirAnimal() {
        super();
    }
    public void fly() {
        System.out.println(this.getName() + " is flying.");
    }
    @Override
    public abstract void train();
}
