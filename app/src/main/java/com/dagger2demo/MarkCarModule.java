package com.dagger2demo;

import dagger.Module;
import dagger.Provides;

@Module
public class MarkCarModule {

    private String gear;

    public MarkCarModule(String gear){
        this.gear=gear;
    }


    @QualifierA
    @Provides
    Engine provideEngineA(){
        return new Engine(gear);
    }

    @QualifierB
    @Provides
    Engine provideEngineB(){return new Engine();}

}
