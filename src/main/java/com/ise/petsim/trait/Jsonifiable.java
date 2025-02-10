package com.ise.petsim.trait;


import org.json.JSONObject;


public interface Jsonifiable {

    JSONObject toJson();

    static <T extends Jsonifiable> T fromJson(JSONObject json) {
        return null;
    }

}
