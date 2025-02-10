package com.ise.petsim.animal;


import com.ise.petsim.animal.abs.type.LandAnimal;


public class Spider extends LandAnimal {

    public Spider() {
        super();
    }

    @Override
    public void train() {
        System.out.println(this.name + " is trained to catch flies.");
    }

    @Override
    public void walk() {
        System.out.println(this.name + " is scurrying on the walls.");
    }

    @Override
    public void makeSound() {
        System.out.println("SyhhSyhhh");
    }

}
