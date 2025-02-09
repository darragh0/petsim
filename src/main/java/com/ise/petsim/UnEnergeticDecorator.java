package com.ise.petsim;

public class UnEnergeticDecorator extends AnimalDecorator {
    public UnEnergeticDecorator(Animal decoratedAnimal) {
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
