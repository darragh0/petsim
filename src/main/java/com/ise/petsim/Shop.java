package com.ise.petsim;


import java.io.IOException;
import java.io.InputStream;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.ise.petsim.enm.Size;
import com.ise.petsim.item.Accessory;
import com.ise.petsim.item.Food;
import com.ise.petsim.item.abs.Item;


public class Shop {

    private final Inventory food;
    private final Inventory accessories;

    public Shop() {
        this.food = new Inventory();
        this.accessories = new Inventory();
    }

    public boolean loadInventory(String filepath, String inventoryType) {
        Inventory inventory = inventoryType.equalsIgnoreCase("food") ? this.food : this.accessories;
        return this.loadInventoryItems(filepath, inventory);
    }

    // @formatter:off
    private Item createFoodItem(JSONObject jsonItem) {
        return new Food(
            jsonItem.getString("name"),
            jsonItem.getDouble("price"),
            jsonItem.getString("icon"),
            jsonItem.getInt("foodPoints")
        );
    }

    private Item createAccessoryItem(JSONObject jsonItem) {
        return new Accessory(
            jsonItem.getString("name"),
            jsonItem.getDouble("price"),
            jsonItem.getString("icon"),
            getSizeEnum(jsonItem.getString("size"))
        );
    }
    private Size getSizeEnum(String size) {
        try {
            return Size.valueOf(size.toUpperCase());
        } catch (IllegalArgumentException e) {
            return Size.MEDIUM;
        }
    }
    // @formatter:on

    private boolean loadInventoryItems(String resourcePath, Inventory inventory) {
        try {
            System.out.println("Loading inventory from: " + resourcePath);

            // Retrieve the file from the classpath as an input stream
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(resourcePath);

            // Check if the file was found; if not, print an error message and return false
            if (inputStream == null) {
                System.err.println("File not found: " + resourcePath);
                return false;
            }

            // Read the entire file into a string
            String jsonText = new String(inputStream.readAllBytes());

            // Parse the string into a JSON array
            JSONArray jsonArray = new JSONArray(jsonText);

            // Determine the item type based on the file path
            boolean isFoodInventory = resourcePath.contains("Food");

            // Loop through each item in the JSON array and create the corresponding object
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonItem = jsonArray.getJSONObject(i);
                Item item =
                    isFoodInventory ? createFoodItem(jsonItem) : createAccessoryItem(jsonItem);
                inventory.addItem(item);
            }

            // Return true to indicate successful inventory loading
            return true;
        } catch (IOException | JSONException e) {
            System.err.println("Error loading inventory: " + e.getMessage());
        }

        // Return false if an error occurred
        return false;
    }

    public Inventory getFood() {
        return this.food;
    }

    public Inventory getAccessories() {
        return this.accessories;
    }

}
