package com.dagger2demo;


import javax.inject.Inject;

public class Car {

    @Inject
    Engine engine;

    public Car(){
        DaggerCarComponent.builder().build().inject(this);
    }

    public void run(){
        engine.run();
    }
}
