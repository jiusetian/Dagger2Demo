package com.dagger2demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @QualifierA
    @Inject
    Engine engineA;

    @QualifierB
    @Inject
    Engine engineB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMainActComponent.builder().markCarModule(new MarkCarModule("dd")).build().inject(this);
        engineA.run();

        engineB.run();
    }
}
