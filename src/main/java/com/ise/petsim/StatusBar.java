package com.ise.petsim;

public class StatusBar implements Observer, Displayable {

    private String name;
    private int value;
    private int maxValue;

    public StatusBar(Animal animal) {
        animal.attach(this);
    }

    @Override
    public void update() {
        // update the value and maxValue based on the animal's stats?
    }

    @Override
    public void display() {
        // Display the status bar
        System.out.println("StatusBar: " + this.name + " Value: " + this.value + "/" + this.maxValue);
    }

    // code for a cool status bar that's moving in cli to be implemented later, would have % on the right
    public static void displayStatusBar(int value, int maxValue) {
        int barLength = 50; //can be whatever we'll see later
        int filledLength = (int) (barLength * ((double) value / maxValue));

        StringBuilder bar = new StringBuilder();
        bar.append("\r["); 
        for (int i = 0; i < barLength; i++) {
            if (i < filledLength) {
                bar.append("=");
            } else {
                bar.append(" ");
            }
        }
        bar.append("] ");
        bar.append(value * 100 / maxValue).append("%");

        System.out.print(bar.toString());
    }

}
