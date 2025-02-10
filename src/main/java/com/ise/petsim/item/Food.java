package com.ise.petsim.item;


import com.ise.petsim.item.abs.Item;


public class Food extends Item {

    private int points;

    public Food(String name, double price, String icon, int points) {
        super(name, price, icon);
        this.points = points;
    }

    public int getPoints() {
        return this.points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

}
