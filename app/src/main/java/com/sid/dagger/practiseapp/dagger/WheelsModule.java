package com.sid.dagger.practiseapp.dagger;

import com.sid.dagger.practiseapp.car.Rims;
import com.sid.dagger.practiseapp.car.Tires;
import com.sid.dagger.practiseapp.car.Wheels;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class WheelsModule {

    @Provides
    static Rims provideRims(){
        return new Rims();
    }

    @Provides
    static Tires provideTires(){
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    @Provides
    static Wheels provideWheels(Rims rims, Tires tires){
        return new Wheels(rims, tires);
    }
}
