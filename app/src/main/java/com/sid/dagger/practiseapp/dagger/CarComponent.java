package com.sid.dagger.practiseapp.dagger;

import com.sid.dagger.practiseapp.MainActivity;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;

@Singleton
@Component(modules = { WheelsModule.class,
                       PetrolEngineModule.class })
public interface CarComponent {

   // Car getCar();

    void inject(MainActivity mainActivity);

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder horsePower(@Named("hp") int horsePower);

        @BindsInstance
        Builder engineCapacity(@Named("ec") int engineCapacity);

        CarComponent build();
    }
}
