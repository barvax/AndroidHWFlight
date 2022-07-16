package com.example.orderflight;

import java.io.Serializable;

public class Flight implements Serializable {
    private String destination;
    private int numberOfTravelers;
    private boolean pet;

    public Flight(String destination, int numberOfTravelers, boolean hasPet) {
        this.destination = destination;
        this.numberOfTravelers = numberOfTravelers;
        this.pet = hasPet;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getNumberOfTravelers() {
        return numberOfTravelers;
    }

    public void setNumberOfTravelers(int numberOfTravelers) {

        this.numberOfTravelers = numberOfTravelers;
    }

    public boolean isHsPet() {
        return pet;
    }

    public void setHsPet(boolean hasPet) {
        this.pet = hasPet;
    }
}
