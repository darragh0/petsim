package com.ise.petsim;

public class Snake extends LandAnimal {
    public Snake() {
        super();
    }
    
    @Override
    public void train() {
        System.out.println(this.getName() + " is trained to hunt small rats.");
    }

    @Override
    public void walk() {
        System.out.println(this.getName() + " is slithering on the floor.");
    }

    @Override
    public void makeSound() {
        System.out.println("HISS");
    }
}
