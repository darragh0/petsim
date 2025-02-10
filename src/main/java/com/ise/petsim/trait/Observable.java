package com.ise.petsim.trait;


import java.util.ArrayList;
import java.util.List;

import com.ise.petsim.Observer;


public abstract class Observable {

    private final List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        this.observers.add(observer);
    }

    public void detach(Observer observer) {
        this.observers.remove(observer);
    }

    protected void notifyObservers() {
        for (Observer observer : this.observers) {
            observer.update();
        }
    }

}
