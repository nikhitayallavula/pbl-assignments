
package com.automobile.fourwheeler;

import com.automobile.Vehicle;

public class Ford extends Vehicle {

    @Override
    public String getModelName() {
        return "Ford Fiesta";
    }

    @Override
    public String getRegistrationNumber() {
        return "TS10AB5678";
    }

    @Override
    public String getOwnerName() {
        return "Anjali";
    }

    public int speed() {
        return 160;
    }

    public int tempControl() {
        return 1;
    }
}