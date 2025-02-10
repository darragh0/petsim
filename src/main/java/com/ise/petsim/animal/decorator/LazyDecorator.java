package com.ise.petsim.animal.decorator;


import com.ise.petsim.animal.abs.Animal;


public class LazyDecorator extends AnimalDecorator {

    public LazyDecorator(Animal decoratedAnimal) {
        super(decoratedAnimal);
    }

    @Override
    public int energyIncrease() {
        return super.energyIncrease() + 5;
    }

    @Override
    public int energyDecrease() {
        return super.energyDecrease() - 2;
    }

}
