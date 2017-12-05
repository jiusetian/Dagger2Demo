package com.dagger2demo;


import android.app.Application;

public class MyApplication extends Application{

    private static MyApplication MyApplicationInstance;
    private ApplicationComponent applicationComponent;

    public static MyApplication getInstance() {

        return MyApplicationInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        MyApplicationInstance=this;
        applicationComponent=DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();
    }

    public ApplicationComponent getApplicationComponent() {

        return applicationComponent;
    }
}
