package com.sid.dagger.practiseapp.car;

import android.util.Log;

import javax.inject.Inject;

public class DiesalEngine implements Engine {
    private static final String TAG = "Car";

    private int horsePower;
    public DiesalEngine(int horsePower){
        this.horsePower = horsePower;
    }

    @Override
    public void start() {
        Log.d(TAG, "DiesalEngine start---HorsePower: "+horsePower);
    }
}
