package com.ise.petsim;

import java.util.ArrayList;

public class Inventory {
    ArrayList<Item> inventory;

    public Inventory() {
        this.inventory = new ArrayList<>();;
    }

    public Item getItem(int index){
        if (index >= 0 && index < inventory.size()){
            return inventory.get(index);
        }
        return null;
    }

    public void addItem(Item item){
        inventory.add(item);
    }

    public ArrayList<Item> getItems(){
        return inventory;
    }
}
