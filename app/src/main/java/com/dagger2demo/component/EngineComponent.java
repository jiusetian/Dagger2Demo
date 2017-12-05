package com.dagger2demo.component;


import com.dagger2demo.ApplicationModule;
import com.dagger2demo.entity.Engine;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface EngineComponent {

    void inject(Engine engine);
}
