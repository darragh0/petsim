package com.ise.petsim;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class Shop {
    private final Inventory food;
    private final Inventory accessories;

    public Shop() {
        this.food = new Inventory();
        this.accessories = new Inventory();
    }


    public boolean loadInventory(String filepath, String inventoryType ) {
        Inventory inventory = inventoryType.equalsIgnoreCase("food")? food : accessories;
        return loadInventoryItems(filepath, inventory);
    }

    private void populateCommonItemFields(Item item, JSONObject jsonItem){
        item.setName(jsonItem.getString("name"));
        item.setPrice(jsonItem.getDouble("price"));
        item.setIcon(jsonItem.getString("icon"));
    }

    private Item createFoodItem(JSONObject jsonItem) {
        Food foodItem = new Food();
        populateCommonItemFields(foodItem, jsonItem);
        foodItem.setFoodPoints(jsonItem.getInt("foodPoints"));
        return foodItem;
    }

    private Item createAccessoryItem(JSONObject jsonItem) {
        Accessory accessoryItem = new Accessory();
       populateCommonItemFields(accessoryItem, jsonItem);
        return accessoryItem;
    }


    private boolean loadInventoryItems(String resourcePath, Inventory inventory) {
        try {
            // Log the start of the inventory loading process
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
                Item item = isFoodInventory ? createFoodItem(jsonItem) : createAccessoryItem(jsonItem);
                inventory.addItem(item);
            }

            // Return true to indicate successful inventory loading
            return true;
        } catch (Exception e) {
            // Catch any exceptions that occur during file reading or JSON parsing
            System.err.println("Error loading inventory: " + e.getMessage());
        }

        // Return false if an error occurred
        return false;
    }


    public Inventory getFood() {
        return food;
    }

    public Inventory getAccessories() {
        return accessories;
    }

}
