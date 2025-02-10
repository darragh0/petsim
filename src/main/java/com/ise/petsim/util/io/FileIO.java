package com.ise.petsim.util.io;


import java.util.function.Function;

import org.json.JSONArray;
import org.json.JSONObject;

import com.ise.petsim.Inventory;
import com.ise.petsim.enm.Size;
import com.ise.petsim.item.Accessory;
import com.ise.petsim.item.Food;
import com.ise.petsim.item.abs.Item;


public final class FileIO {

    private FileIO() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated.");
    }

    public static Inventory<Food> loadFoodInventory(JSONArray jsonArr) {
        return loadInventory(jsonArr, FileIO::createFoodItem);
    }

    public static Inventory<Accessory> loadAccessoryInventory(JSONArray jsonArr) {
        return loadInventory(jsonArr, FileIO::createAccessoryItem);
    }

    private static <T extends Item> Inventory<T> loadInventory(
        JSONArray jsonArr,
        Function<JSONObject, T> creator) {

        Inventory<T> inv = new Inventory<>();

        for (int i = 0; i < jsonArr.length(); i++) {
            Object obj = jsonArr.get(i);
            if (!(obj instanceof JSONObject)) {
                throw new IllegalArgumentException("Invalid item format at index " + i);
            }
            try {
                T item = creator.apply((JSONObject) obj);
                inv.addItem(item);
            } catch (Exception e) {
                throw new IllegalArgumentException("Failed to create item at index " + i, e);
            }
        }

        return inv;
    }


    private static Food createFoodItem(JSONObject json) {
        validateRequiredFields(json, "name", "price", "icon", "foodPoints");

        return new Food(
            json.getString("name"),
            json.getDouble("price"),
            json.getString("icon"),
            json.getInt("foodPoints"));
    }

    private static Accessory createAccessoryItem(JSONObject json) {
        validateRequiredFields(json, "name", "price", "icon", "size");

        String size = json.getString("size");
        try {
            return new Accessory(
                json.getString("name"),
                json.getDouble("price"),
                json.getString("icon"),
                Size.valueOf(size));
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid size value: " + size);
        }
    }

    private static void validateRequiredFields(JSONObject json, String... fields) {
        for (String field : fields) {
            if (!json.has(field)) {
                throw new IllegalArgumentException("Missing required field: " + field);
            }
        }
    }

}
