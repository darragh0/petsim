package com.ise.petsim;

import java.util.concurrent.TimeUnit;

import com.ise.petsim.enums.Color;
import com.ise.petsim.enums.Size;

/**
 * Abstract base class for all animals in the pet simulation.
 * Implements basic animal behaviors and stats management.
 */

public abstract class Animal extends Observable {  // observer pattern to be implemented because I forgot what it depends on 

    private static final double ENERGY_REDUCTION_RATE = 13.0;
    private static final double CLEANLINESS_REDUCTION_RATE = 14.0;
    private static final double ENERGY_INCREASE_RATE = 15.0;
    private static final double CLEANLINESS_INCREASE_RATE = 16.0;
    private static final double INITIAL_RATIO = 2.0;

    private String name;
    private Color color;
    private int energy;
    private int cleanliness;
    private Size size;

    public Animal() {
        // start stat bars below max to allow performing functionalities
        this.color = Color.RESET;
        this.size = Size.MEDIUM;
        this.name = "pet";
        this.energy = (int) (this.size.getMaxEnergy() / INITIAL_RATIO);
        this.cleanliness = (int) (this.size.getMaxCleanliness() / INITIAL_RATIO);
    }

    public abstract void makeSound();

    // these are the methods to be decorated
    public int energyIncrease() {
        return 0;
    }

    public int energyDecrease() {
        return 0;
    }

    public int cleanlinessIncrease() {
        return 0;
    }

    public int cleanlinessDecrease() {
        return 0;
    }

    private int getMaxEnergy() {
        return this.size.getMaxEnergy();
    }

    private int getMaxCleanliness() {
        return this.size.getMaxCleanliness();
    }


    public void eat(int foodPoints) {
        int maxEnergyValue = this.getMaxEnergy();

        if (this.energy == maxEnergyValue) {
            System.out.println("I'm so full, I can't eat another bite!");
            return;
        }

        int newEnergyValue = foodPoints + energy + energyIncrease();
        this.energy = Math.min(newEnergyValue, maxEnergyValue);

        System.out.println("Yum, thanks for the food!");
    }

    public void sleep() {
        int maxEnergyValue = this.getMaxEnergy();

        if (this.energy == maxEnergyValue) {
            System.out.println("Sleep is for the weak, let's play instead!");
            return;
        }

        // Increase by 15% of max energy
        int sleepPoints = (int) Math.ceil(maxEnergyValue / ENERGY_INCREASE_RATE);
        int newEnergyValue = this.energy + sleepPoints + this.energyIncrease();

        System.out.println("Okay, goodnight!");
        System.out.println("Zzzz...");

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            System.out.println("I got woken up too early!");
        }

        this.energy = Math.min(newEnergyValue, maxEnergyValue);
        System.out.println("Ahh that was a great nap. Now time to play!");
    }

    public void reduceEnergy() {
        // Reduce by 13% of max energy
        int energyReduction = (int) Math.ceil(this.getMaxEnergy() / ENERGY_REDUCTION_RATE);
        this.energy = Math.max(0, this.energy - energyReduction - this.energyDecrease());
    }

    public void bathe() {
        if (this.cleanliness == this.getMaxCleanliness()) {
            System.out.println("I'm already clean, no need for a bath!");
            return;
        }

        // Increase by 16% of max cleanliness
        int bathePoints = (int) Math.ceil(this.getMaxCleanliness() / CLEANLINESS_INCREASE_RATE);
        int newCleanlinessValue = this.cleanliness + bathePoints + this.cleanlinessIncrease();
        this.cleanliness = Math.min(newCleanlinessValue, this.getMaxCleanliness());

        System.out.println("Thank you! It feels great to be clean");
    }

    public void reduceCleanliness() {
        // Reduce by 14% of max cleanliness
        int cleanlinessReduction =
                (int) Math.ceil(this.getMaxCleanliness() / CLEANLINESS_REDUCTION_RATE);
        this.cleanliness =
                Math.max(0, this.cleanliness - cleanlinessReduction - this.cleanlinessDecrease());
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setSize(Size size) {
        this.size = size;
        this.energy = (int) (size.getMaxEnergy() / INITIAL_RATIO);
    }

    public void train() {
        // TODO: Implement training logic when AnimalState is ready
    }

}
