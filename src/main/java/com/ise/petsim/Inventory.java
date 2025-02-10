package com.ise.petsim;


import java.util.ArrayList;
import java.util.Optional;

import com.ise.petsim.item.abs.Item;


public class Inventory {

    ArrayList<Item> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public Optional<Item> getItem(int index) {
        if (index >= 0 && index < this.items.size()) {
            return Optional.ofNullable(this.items.get(index));
        }
        return Optional.empty();
    }

    public void addItem(Item item) {
        this.items.add(item);
    }

    public ArrayList<Item> getItems() {
        return this.items;
    }

}
