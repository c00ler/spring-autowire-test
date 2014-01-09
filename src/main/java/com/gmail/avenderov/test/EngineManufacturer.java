package com.gmail.avenderov.test;

import org.springframework.beans.factory.FactoryBean;

import org.springframework.stereotype.Component;

/**
 * @author  avenderov
 */
@Component
public class EngineManufacturer implements FactoryBean<Engine> {

    @Override
    public Engine getObject() throws Exception {

        // OOPS!!! Returning null for some reason
        return null;
    }

    @Override
    public Class<?> getObjectType() {
        return Engine.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

}
