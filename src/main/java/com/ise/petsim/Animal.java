package com.ise.petsim;

import com.ise.petsim.Enums.Colour;
import com.ise.petsim.Enums.Size;

import java.util.concurrent.TimeUnit;

/**
 * Abstract base class for all animals in the pet simulation.
 * Implements basic animal behaviors and stats management.
 */

public abstract class Animal {
    private static final double ENERGY_REDUCTION_RATE = 13.0;
    private static final double CLEANLINESS_REDUCTION_RATE = 14.0;
    private static final double ENERGY_INCREASE_RATE = 15.0;
    private static final double CLEANLINESS_INCREASE_RATE = 16.0;
    private static final double INITIAL_RATIO = 2.0;

    private String name;
    private Colour colour;
    private  int energy;
    private  int cleanliness;
    private Size animalSize;

    public Animal() {
        // start stat bars below max to allow performing functionalities
        this.colour = Colour.RESET;
        this.animalSize = Size.MEDIUM;
        this.name = "pet";
        this.energy = (int) (animalSize.getMaxEnergy() /INITIAL_RATIO);
        this.cleanliness = (int) (animalSize.getMaxCleanliness() /INITIAL_RATIO);

    }

    public abstract void makeSound();

    // these are the methods to be decorated
    public int energyIncrease(){ return 0; }

    public int energyDecrease(){ return 0; }

    public int cleanlinessIncrease(){ return 0; }

    public int cleanlinessDecrease(){ return 0; }

    private int getMaxEnergy() {
        return animalSize.getMaxEnergy();
    }

    private int getMaxCleanliness(){
        return animalSize.getMaxCleanliness();
    }


    public void eat(int foodPoints){
        int maxEnergyValue = getMaxEnergy();
        if (energy == maxEnergyValue){
            System.out.println("I'm so full, I can't eat another bite!");
            return;
        }
        int newEnergyValue  = foodPoints + energy + energyIncrease();
        System.out.println("Yum, thanks for the food!");
        energy = Math.min(newEnergyValue , maxEnergyValue);
    }

    public void sleep() {
        int maxEnergyValue = getMaxEnergy();
        if (energy == maxEnergyValue) {
            System.out.println("Sleep is for the weak, let's play instead!");
            return;
        }
        int sleepPoints = (int) Math.ceil(getMaxEnergy() / ENERGY_INCREASE_RATE);  // Increase by 15% of max energy
        int newEnergyValue  = energy + sleepPoints + energyIncrease();
        System.out.println("Okay, goodnight!");

        System.out.println("Zzzz...");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            System.out.println("I got woken up too early!");
        }

        energy = Math.min(newEnergyValue , maxEnergyValue);
        System.out.println("Ahh that was a great nap. Now time to play!");
    }

    public void reduceEnergy() {
        int energyReduction = (int) Math.ceil(getMaxEnergy() / ENERGY_REDUCTION_RATE);  // Reduce by 13% of max energy
        energy = Math.max(0, energy - energyReduction - energyDecrease());
    }


    public void bathe() {
        if (cleanliness == getMaxCleanliness()) {
            System.out.println("I'm already clean, no need for a bath!");
            return;
        }

        System.out.println("Thank you! It feels great to be clean");
        int bathePoints = (int) Math.ceil(getMaxCleanliness() / CLEANLINESS_INCREASE_RATE);  // Increase by 16% of max cleanliness
        int newCleanlinessValue = cleanliness + bathePoints + cleanlinessIncrease();
        cleanliness = Math.min(newCleanlinessValue, getMaxCleanliness());
    }

    public void reduceCleanliness(){
        int cleanlinessReduction = (int) Math.ceil(getMaxCleanliness() / CLEANLINESS_REDUCTION_RATE); // Reduce by 14% of max cleanliness
        cleanliness = Math.max(0, cleanliness - cleanlinessReduction - cleanlinessDecrease());
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    
    public void setColour(Colour colour) { this.colour = colour; }

    public void setAnimalSize(Size animalSize) {
        this.animalSize = animalSize;
        this.energy = (int) (animalSize.getMaxEnergy() /INITIAL_RATIO);
    }

    public void train(){
        // TODO: Implement training logic when AnimalState is ready
    }

}
