package com.ise.petsim;

public class Spider extends LandAnimal {
    public Spider() {
        super();
    }

    @Override
    public void train() {
        System.out.println(this.getName() + " is trained to catch flies.");
    }

    @Override
    public void walk() {
        System.out.println(this.getName() + " is scurrying on the walls.");
    }
    
    @Override
    public void makeSound() {
        System.out.println("SyhhSyhhh");
    }
}
