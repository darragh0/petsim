package com.ise.petsim;

public abstract class Item {
    private String name;
    private double price;
    private String icon;

    public Item() {
        this.name = "";
        this.price = 0;
        this.icon = "";
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
