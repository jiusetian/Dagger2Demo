package com.dagger2demo;

import dagger.Component;

@Component
public interface CarComponent {
    void inject(Car car);

}
