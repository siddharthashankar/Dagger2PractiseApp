package com.sid.dagger.practiseapp.dagger;

import com.sid.dagger.practiseapp.MainActivity;

import dagger.Component;

@Component(modules = { WheelsModule.class,
                       DiesalEngineModule.class })
public interface CarComponent {

   // Car getCar();

    void inject(MainActivity mainActivity);
}
