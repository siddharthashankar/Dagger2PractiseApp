package com.sid.dagger.practiseapp;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car";
    private Engine mEngine;
    private Wheels mWheels;

    @Inject
    public Car(Engine mEngine, Wheels mWheels) {
        this.mEngine = mEngine;
        this.mWheels = mWheels;
    }

    public void drive(){
        Log.d(TAG, "drive: driving3---");
    }
    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }
}
