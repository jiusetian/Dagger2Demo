package com.dagger2demo;


import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {
    MyApplication getApplication();

    Context getContext();
}
