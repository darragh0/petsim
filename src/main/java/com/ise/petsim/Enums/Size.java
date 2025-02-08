package com.ise.petsim.Enums;
public enum Size{
    // the values are the max values assigned to each animal depending on their size
    SMALL(100, 100),
    MEDIUM(125, 110),
    LARGE(150, 120);

    private final int maxEnergy;
    private final int maxCleanliness;
    // Constructor
    Size(int maxEnergy, int maxCleanliness) {
        this.maxEnergy = maxEnergy;
        this.maxCleanliness = maxCleanliness;
    }

    // Getter Method
    public int getMaxEnergy() {
        return maxEnergy;
    }
    public int getMaxCleanliness(){
        return maxCleanliness;
    }
}