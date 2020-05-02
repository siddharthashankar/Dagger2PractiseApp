package com.sid.dagger.practiseapp.car;

import android.util.Log;

import javax.inject.Inject;

public class DiesalEngine implements Engine {
    private static final String TAG = "Car";

    @Inject
    public DiesalEngine(){}

    @Override
    public void start() {
        Log.d(TAG, "DiesalEngine start---");
    }
}
