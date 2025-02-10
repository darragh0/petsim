package com.ise.petsim;

public abstract class LandAnimal extends LeggedAnimals {
    public LandAnimal() {
        super();
    }
    public void walk() {
        System.out.println(this.getName() + " is walking.");
    }
    
    @Override
    public abstract void train();
}
