package com.dagger2demo;

import dagger.Component;

@CarScope
@Component(modules = MarkEngineModule.class,dependencies = ApplicationComponent.class)
public interface MainActComponent {

    void inject(MainActivity mainActivity);
}
