package com.ise.petsim;

public abstract class WaterAnimal extends Animal {
    public WaterAnimal() {
        super(); 
    }

    public void swim() {
        System.out.println(this.getName() + " is swimming.");
    }

    @Override
    public abstract void train();
}