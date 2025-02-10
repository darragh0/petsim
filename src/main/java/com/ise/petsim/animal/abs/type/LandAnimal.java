package com.ise.petsim.animal.abs.type;


public abstract class LandAnimal extends LeggedAnimal {

    public LandAnimal() {
        super();
    }

    public void walk() {
        System.out.println(this.name + " is walking.");
    }

    @Override
    public abstract void train();

}
