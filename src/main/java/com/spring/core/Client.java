package com.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String args[]) {
//        Vehicle vehicle = new Car();
//        Traveller traveller = new Traveller(vehicle);
//        traveller.startJourney();

        // Creating Spring IOC Container - ApplicationContext
        // Container reads the configuration class
        // and create and manage Spring beans
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        // Retrieve beans from IOC container
        Car car = applicationContext.getBean(Car.class);
        car.move();

        Bike bike = applicationContext.getBean(Bike.class);
        bike.move();

        Traveller traveller = applicationContext.getBean(Traveller.class);
        traveller.startJourney();
    }
}
