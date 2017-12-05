package com.dagger2demo;


import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface EngineComponent {

    void inject(Engine engine);
}
