package com.gmail.avenderov.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(final String[] args) {
        final ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        Car car = context.getBean(Car.class);
        car.drive(); // We are getting NPE in runtime
    }

}
