package com.spring.core;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("car") // bean name default : class name with first letter lowercase
@Primary // higher preference on Car bean among all the classes of the same type for injection
public class Car implements Vehicle{
    @Override
    public void move() {
        System.out.println("Car is moving ..");
    }
}
