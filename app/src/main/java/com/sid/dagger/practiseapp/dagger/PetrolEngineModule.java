package com.sid.dagger.practiseapp.dagger;

import com.sid.dagger.practiseapp.car.Engine;
import com.sid.dagger.practiseapp.car.PetrolEngine;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
