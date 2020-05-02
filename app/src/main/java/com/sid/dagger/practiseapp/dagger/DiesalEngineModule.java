package com.sid.dagger.practiseapp.dagger;

import com.sid.dagger.practiseapp.car.DiesalEngine;
import com.sid.dagger.practiseapp.car.Engine;
import dagger.Module;
import dagger.Provides;

@Module
public  class DiesalEngineModule {
    private int horsePower;

    public DiesalEngineModule(int horsePower){
        this.horsePower = horsePower;
    }

    @Provides
    Engine provideEngine(){
        return new DiesalEngine(horsePower);
    }
}
