package com.ise.petsim.item.abs;


public abstract class Item {

    private String name;
    private double price;
    private String icon;

    public Item(String name, double price, String icon) {
        this.name = name;
        this.price = price;
        this.icon = icon;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getIcon() {
        return this.icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

}
