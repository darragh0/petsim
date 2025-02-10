package com.ise.petsim.animal.abs.type;


import com.ise.petsim.animal.abs.Animal;


public abstract class LeggedAnimal extends Animal {

    public LeggedAnimal() {
        super();
    }

    @Override
    public void bathe() {
        System.out.println(this.name + " is bathing.");
        super.bathe();
    }

    // willl add getDiry() method
}
