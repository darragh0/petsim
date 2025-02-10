package com.ise.petsim.animal.decorator;


import com.ise.petsim.animal.abs.Animal;


public class CleanDecorator extends AnimalDecorator {

    public CleanDecorator(Animal decoratedAnimal) {
        super(decoratedAnimal);
    }

    @Override
    public int cleanlinessIncrease() {
        return super.cleanlinessIncrease() + 2;
    }

    @Override
    public int cleanlinessDecrease() {
        return super.cleanlinessDecrease() - 5;
    }

}
