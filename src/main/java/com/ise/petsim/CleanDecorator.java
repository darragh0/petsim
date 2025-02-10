package com.ise.petsim;

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