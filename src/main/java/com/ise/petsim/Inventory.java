package com.ise.petsim;

import java.util.ArrayList;
import java.util.Optional;

public class Inventory {
    ArrayList<Item> inventory;

    public Inventory() {
        this.inventory = new ArrayList<>();
    }

    public Optional<Item> getItem(int index) {
        if (index >= 0 && index < this.inventory.size()) {
            return Optional.ofNullable(this.inventory.get(index));
        }
        return Optional.empty();
    }

    public void addItem(Item item) {
        this.inventory.add(item);
    }

    public ArrayList<Item> getItems() {
        return this.inventory;
    }
}
