package com.ise.petsim.Enums;

public enum Colour{
    // the codes attached to the colours will be used to change their colour in the cli
    PINK("\\033[95m"),
    RED("\\033[31m"),
    BROWN("\\033[33m"),
    RESET("\\033[0m");

    private final String colour;

    // Constructor
    Colour(String colour) {
        this.colour = colour;
    }

    // Getter Method
    public String getColourValue() {
        return colour;
    }
}
