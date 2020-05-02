package com.sid.dagger.practiseapp.car;

import android.util.Log;

import javax.inject.Inject;
import javax.inject.Named;

public class PetrolEngine implements Engine {
    private static final String TAG = "Car";

    private int horsePower;
    private int engineCapacity;

    @Inject
    public PetrolEngine(@Named("hp") int horsePower, @Named("ec") int engineCapacity){
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void start() {
        Log.d(TAG, "PetrolEngine started:----HorsePower:"+horsePower +", Engine Capacity:"+engineCapacity);
    }
}
