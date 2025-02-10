package com.ise.petsim.menu.abs;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.ise.petsim.util.io.ConsoleIO.intInput;
import static com.ise.petsim.util.io.ConsoleIO.println;


public abstract class Menu {

    protected final String heading;
    protected final Map<String, Runnable> actions = new HashMap<>();
    protected final List<String> options = new ArrayList<>();

    protected Menu(String heading) {
        this.heading = heading;
    }

    public final void addOption(String option, Runnable action) {
        actions.put(option, action);
        options.add(option);
    }

    public Runnable getUserChoice() {
        return this.getUserChoice("Enter your choice >> ");
    }

    public final String getHeading() {
        return this.heading;
    }

    public final Map<String, Runnable> getActions() {
        return this.actions;
    }

    public final List<String> getOptions() {
        return this.options;
    }

    public void print() {
        println("<B>%s</B>", this.heading);
        System.out.println("=".repeat(this.heading.length() + 10));

        for (int i = 0; i < this.options.size(); i++) {
            println("<b>%d)</b> %s", i + 1, this.options.get(i));
        }
        println();
    }

    public Runnable getUserChoice(String prompt) {
        int choice = intInput(prompt, 1, this.options.size());
        return this.actions.get(this.options.get(choice - 1));
    }

}
