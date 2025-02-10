package com.ise.petsim;

public abstract class LeggedAnimals extends Animal {
    public LeggedAnimals() {
        super();
    }
    
    public void bathe() {
        System.out.println(this.getName() + " is bathing.");
        super.bathe();
    }
    //willl add getDiry() method
}
