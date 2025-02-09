package com.ise.petsim;

class DirtyDecorator extends AnimalDecorator {
    public DirtyDecorator(Animal decoratedAnimal) {
        super(decoratedAnimal);
    }
    
    @Override
    public void makeSound() {
        decoratedAnimal.makeSound();
    }
    
    @Override
    public void bathe() {
    }
    
    @Override
    public void getHungry() {
    }
}
