package com.ise.petsim;

public class UnEnergeticDecorator extends AnimalDecorator {
    public UnEnergeticDecorator(Animal decoratedAnimal) {
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