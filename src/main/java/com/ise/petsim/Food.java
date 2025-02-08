package com.ise.petsim;

public class Food extends Item {
    private int FoodPoints;

    public Food() {
        super();
    }

    public int getFoodPoints() {
        return FoodPoints;
    }

    public void setFoodPoints(int foodPoints) {
        FoodPoints = foodPoints;
    }
}
