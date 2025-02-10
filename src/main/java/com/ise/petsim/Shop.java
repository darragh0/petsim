package com.ise.petsim;


import java.util.Optional;

import org.json.JSONObject;

import com.ise.petsim.item.Accessory;
import com.ise.petsim.item.Food;
import static com.ise.petsim.util.io.ConsoleIO.printErr;
import static com.ise.petsim.util.io.FileIO.loadAccessoryInventory;
import static com.ise.petsim.util.io.FileIO.loadFoodInventory;
import static com.ise.petsim.util.io.FileIO.loadJsonResource;


public class Shop {

    private final Inventory<Food> food;
    private final Inventory<Accessory> accessories;

    public Shop() {
        this.food = new Inventory<>();
        this.accessories = new Inventory<>();
        this.loadInventoryItems("json/shop_items.json");
    }

    private boolean loadInventoryItems(String path) {
        System.out.println("Loading inventory from: " + path);
        Optional<JSONObject> json = loadJsonResource(path);

        if (json.isEmpty()) {
            return false;
        }

        JSONObject shopItems = json.get();

        final String[] keys = { "food", "accessories" };
        for (String key : keys) {
            if (!shopItems.has(key)) {
                printErr("Invalid JSON or missing key (in %s): %s", path, key);
                return false;
            }
        }

        this.food.extendInventory(
            loadFoodInventory(shopItems.getJSONArray("food")));
        this.accessories.extendInventory(
            loadAccessoryInventory(shopItems.getJSONArray("accessories")));

        return true;

    }

    public Inventory<Food> getFood() {
        return this.food;
    }

    public Inventory<Accessory> getAccessories() {
        return this.accessories;
    }

}
