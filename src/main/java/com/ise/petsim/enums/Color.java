package com.ise.petsim.enums;

public enum Color {
    // codes attached to the colours will be used to change their colour in the cli
    PINK("\033[95m"),
    RED("\033[31m"),
    BROWN("\033[33m"),
    RESET("\033[0m");

    private final String value;

    Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
