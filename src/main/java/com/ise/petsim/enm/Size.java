package com.ise.petsim.enm;


public enum Size {
    SMALL(100, 100),
    MEDIUM(125, 110),
    LARGE(150, 120);

    private final int maxEnergy;
    private final int maxCleanliness;

    Size(int maxEnergy, int maxCleanliness) {
        this.maxEnergy = maxEnergy;
        this.maxCleanliness = maxCleanliness;
    }

    public int getMaxEnergy() {
        return maxEnergy;
    }

    public int getMaxCleanliness() {
        return maxCleanliness;
    }

}
