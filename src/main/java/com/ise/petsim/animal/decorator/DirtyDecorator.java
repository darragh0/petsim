package com.ise.petsim.animal.decorator;


import com.ise.petsim.animal.abs.Animal;


public class DirtyDecorator extends AnimalDecorator {

    public DirtyDecorator(Animal decoratedAnimal) {
        super(decoratedAnimal);
    }

    @Override
    public int cleanlinessIncrease() {
        return super.cleanlinessIncrease() + 5;
    }

    @Override
    public int cleanlinessDecrease() {
        return super.cleanlinessDecrease() - 2;
    }

}
