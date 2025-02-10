package com.ise.petsim;

abstract class AnimalDecorator extends Animal {
    protected Animal decoratedAnimal;

    public AnimalDecorator(Animal decoratedAnimal) {
        super();
        this.decoratedAnimal = decoratedAnimal;
    }

    @Override
    public void makeSound() {
        decoratedAnimal.makeSound(); 
    }

    @Override
    public int energyIncrease() {
        return decoratedAnimal.energyIncrease();
    }

    @Override
    public int energyDecrease() {
        return decoratedAnimal.energyDecrease(); 
    }

    @Override
    public int cleanlinessIncrease() {
        return decoratedAnimal.cleanlinessIncrease(); 
    }

    @Override
    public int cleanlinessDecrease() {
        return decoratedAnimal.cleanlinessDecrease(); 
    }
}