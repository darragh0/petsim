package com.ise.petsim.animal;


import com.ise.petsim.animal.abs.type.WaterAnimal;


public class Goldfish extends WaterAnimal {

    public Goldfish() {
        super();
    }

    @Override
    public void train() {
        System.out.println(this.name + " is trained to swim through hoops.");
    }

    @Override
    public void swim() {
        System.out.println(this.name + " is swimming gracefully.");
    }

    @Override
    public void makeSound() {
        System.out.println("Blub blub");
    }

}
