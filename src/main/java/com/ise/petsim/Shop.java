package com.ise.petsim;


import java.io.IOException;
import java.io.InputStream;

import org.json.JSONException;
import org.json.JSONObject;

import com.ise.petsim.item.Accessory;
import com.ise.petsim.item.Food;
import static com.ise.petsim.util.io.ConsoleIO.printErr;
import static com.ise.petsim.util.io.FileIO.loadAccessoryInventory;
import static com.ise.petsim.util.io.FileIO.loadFoodInventory;


public class Shop {

    private final Inventory<Food> food;
    private final Inventory<Accessory> accessories;

    public Shop() {
        this.food = new Inventory<>();
        this.accessories = new Inventory<>();
        this.loadInventoryItems("json/shop_items.json");
    }

    private boolean loadInventoryItems(String path) {
        try {
            System.out.println("Loading inventory from: " + path);

            // Retrieve the file from the classpath as an input stream
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(path);

            if (inputStream == null) {
                printErr("File not found: %s", path);
                return false;
            }

            String jsonText = new String(inputStream.readAllBytes());
            JSONObject shopItems = new JSONObject(jsonText);

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
        } catch (IOException | JSONException e) {
            System.err.println("Error loading inventory: " + e.getMessage());
        }

        // Return false if an error occurred
        return false;
    }

    public Inventory<Food> getFood() {
        return this.food;
    }

    public Inventory<Accessory> getAccessories() {
        return this.accessories;
    }

}
