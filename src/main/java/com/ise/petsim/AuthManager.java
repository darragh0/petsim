package com.ise.petsim;


import static com.ise.petsim.util.IO.println;


public final class AuthManager {

    private AuthManager() {
        throw new UnsupportedOperationException("This class cannot be instantiated");
    }

    public static void login() {
        println("Logging in...");
    }

    public static void register() {
        println("Creating new account...");
    }

}
