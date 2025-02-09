package com.ise.petsim;

public class EnergeticDecorator extends AnimalDecorator {
    public EnergeticDecorator(Animal decoratedAnimal) {
        super(decoratedAnimal);
    }
    @Override
    public void makeSound() {
        decoratedAnimal.makeSound();
    }
    @Override
    public void sleep() {
    }
    @Override
    public void getHungry() {
    }
}
