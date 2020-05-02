package com.sid.dagger.practiseapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.sid.dagger.practiseapp.car.Car;
import com.sid.dagger.practiseapp.dagger.CarComponent;
import com.sid.dagger.practiseapp.dagger.DaggerCarComponent;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject
    Car car;
   // @Inject Remote remote;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent component = DaggerCarComponent.builder()
                .horsePower(150)
                .engineCapacity(1400)
                .build();
        component.inject(this);

        car.drive();
       // car.enableRemote(remote);
    }
}
