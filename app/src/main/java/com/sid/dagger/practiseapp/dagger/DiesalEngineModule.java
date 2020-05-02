package com.sid.dagger.practiseapp.dagger;

import com.sid.dagger.practiseapp.car.DiesalEngine;
import com.sid.dagger.practiseapp.car.Engine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class DiesalEngineModule {

    @Binds
   abstract Engine getEngine(DiesalEngine engine);
}
