package com.dagger2demo;


import android.util.Log;

import javax.inject.Inject;

public class Engine {

    private String gear;

    Engine(String gear){
        this.gear=gear;
    }

    @Inject
    Engine(){}

    public void run(){
        Log.d("tag","引擎运转起来了");
    }
}