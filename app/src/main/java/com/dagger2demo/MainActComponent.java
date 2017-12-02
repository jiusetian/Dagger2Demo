package com.dagger2demo;

import dagger.Component;

@CarScope
@Component(modules = {MarkCarModule.class})
public interface MainActComponent {

    void inject(MainActivity mainActivity);
}
