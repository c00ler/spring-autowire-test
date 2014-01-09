package com.gmail.avenderov.test;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

/**
 * @author  avenderov
 */
@Component
public class Car {

    @Autowired
    private Engine engine;

    public void drive() {
        engine.start();
    }

}
