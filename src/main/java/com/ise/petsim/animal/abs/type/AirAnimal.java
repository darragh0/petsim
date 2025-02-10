package com.ise.petsim.animal.abs.type;


public abstract class AirAnimal extends LeggedAnimal {

    public AirAnimal() {
        super();
    }

    public void fly() {
        System.out.println(this.name + " is flying.");
    }

    @Override
    public abstract void train();

}
