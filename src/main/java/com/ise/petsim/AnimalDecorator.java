package com.ise.petsim;

abstract class AnimalDecorator extends Animal {
    protected Animal decoratedAnimal;

    public AnimalDecorator(Animal decoratedAnimal) {
        super();
        this.decoratedAnimal = decoratedAnimal;
    }
}
