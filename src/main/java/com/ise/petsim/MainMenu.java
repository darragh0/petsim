package com.ise.petsim;


final class MainMenu extends Menu {

    public MainMenu() {
        super("Main Menu");
        this.addOption("Login", AuthManager::login);
        this.addOption("Register", AuthManager::register);
        this.addOption("Exit", SimManager::exit);
    }

}
