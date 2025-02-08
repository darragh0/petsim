package com.ise.petsim;

public class Food extends Item {
    private int foodPoints;

    public Food(String name, double price, String icon, int foodPoints) {
        super(name, price, icon);
        this.foodPoints = foodPoints;
    }


    public int getFoodPoints() {
        return this.foodPoints;
    }

    public void setFoodPoints(int foodPoints) {
        this.foodPoints = foodPoints;
    }
}
