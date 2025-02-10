package com.ise.petsim.animal;


import com.ise.petsim.animal.abs.type.LandAnimal;


public class Snake extends LandAnimal {

    public Snake() {
        super();
    }

    @Override
    public void train() {
        System.out.println(this.name + " is trained to hunt small rats.");
    }

    @Override
    public void walk() {
        System.out.println(this.name + " is slithering on the floor.");
    }

    @Override
    public void makeSound() {
        System.out.println("HISS");
    }

}
