package com.ise.petsim;

class CleanDecorator extends AnimalDecorator {
    public CleanDecorator(Animal decoratedAnimal) {
        super(decoratedAnimal);
    }
    
    @Override
    public void makeSound() {
        decoratedAnimal.makeSound();
    }
    
    @Override
    public void eat(int foodPoints) {
    }
    
    @Override
    public void getHungry() {
    }
}
