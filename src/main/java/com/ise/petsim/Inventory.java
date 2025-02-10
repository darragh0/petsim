package com.ise.petsim;


import java.util.ArrayList;
import java.util.Optional;

import com.ise.petsim.item.abs.Item;


public class Inventory<T extends Item> {

    ArrayList<T> items;

    public Inventory() {
        this.items = new ArrayList<>();
    }

    public Optional<T> getItem(int index) {
        if (index >= 0 && index < this.items.size()) {
            return Optional.ofNullable(this.items.get(index));
        }
        return Optional.empty();
    }

    public void addItem(T item) {
        this.items.add(item);
    }

    public void extendInventory(Inventory<T> inv) {
        this.items.addAll(inv.items);
    }

    public ArrayList<T> getItems() {
        return this.items;
    }

}
