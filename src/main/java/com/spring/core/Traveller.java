package com.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("traveller")
public class Traveller {
    private Vehicle vehicle;

    @Autowired
    public Traveller(Vehicle vehicle) { // "car" = bean name
        this.vehicle = vehicle;
    }

    public void startJourney() {
        this.vehicle.move();
    }
}
