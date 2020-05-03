package com.sid.dagger.practiseapp.car;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";
    private Engine mEngine;
    private Wheels mWheels;
    private Driver mDriver;

    @Inject
    public Car(Engine mEngine, Wheels mWheels, Driver driver) {
        this.mEngine = mEngine;
        this.mWheels = mWheels;
        this.mDriver = driver;
    }

    public void drive(){
        mEngine.start();
        Log.d(TAG, mDriver+" drives "+this);
    }
    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }
}
