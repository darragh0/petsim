package com.ise.petsim.menu;


import com.ise.petsim.AuthManager;
import com.ise.petsim.SimManager;
import com.ise.petsim.menu.abs.Menu;


public final class MainMenu extends Menu {

    public MainMenu() {
        super("Main Menu");
        this.addOption("Login", AuthManager::login);
        this.addOption("Register", AuthManager::register);
        this.addOption("Exit", SimManager::exit);
    }

}
