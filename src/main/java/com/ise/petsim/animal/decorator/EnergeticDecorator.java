package com.ise.petsim.animal.decorator;


import com.ise.petsim.animal.abs.Animal;


public class EnergeticDecorator extends AnimalDecorator {

    public EnergeticDecorator(Animal decoratedAnimal) {
        super(decoratedAnimal);
    }

    @Override
    public int energyIncrease() {
        return super.energyIncrease() + 2;
    }

    @Override
    public int energyDecrease() {
        return super.energyDecrease() - 5;
    }

}
