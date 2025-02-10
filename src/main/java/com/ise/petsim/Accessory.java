package com.ise.petsim;

import com.ise.petsim.enums.Size;

public class Accessory extends Item {

    private Size compatibleSize;

    public Accessory(String name, double price, String icon, Size compatibleSize) {
        super(name, price, icon);
        this.compatibleSize = compatibleSize;
    }

    public Size getCompatibleSize() {
        return this.compatibleSize;
    }

    public void setCompatibleSize(Size compatibleSize) {
        this.compatibleSize = compatibleSize;
    }
}
