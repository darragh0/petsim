package com.ise.petsim.animal.abs.type;


import com.ise.petsim.animal.abs.Animal;


public abstract class WaterAnimal extends Animal {

    public WaterAnimal() {
        super();
    }

    public void swim() {
        System.out.println(this.name + " is swimming.");
    }

    @Override
    public abstract void train();

}
