package com.automobile.twowheeler;

import com.automobile.Vehicle;

public class Honda extends Vehicle {

    @Override
    public String getModelName() {
        return "Honda Shine";
    }

    @Override
    public String getRegistrationNumber() {
        return "TS09CD5678";
    }

    @Override
    public String getOwnerName() {
        return "Prasuna";
    }

    public int getSpeed() {
        return 95;
    }

    public void cdplayer() {
        System.out.println("CD Player is ON");
    }
}