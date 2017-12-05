package com.dagger2demo.component;

import com.dagger2demo.ApplicationComponent;
import com.dagger2demo.MainActivity;
import com.dagger2demo.module.EngineModule;

import dagger.Component;
import com.dagger2demo.util.CarScope;

@CarScope
@Component(modules = EngineModule.class,dependencies = ApplicationComponent.class)
public interface MainActComponent {

    void inject(MainActivity mainActivity);
}
