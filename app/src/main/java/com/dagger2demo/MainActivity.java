package com.dagger2demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.dagger2demo.entity.Engine;
import com.dagger2demo.module.EngineModule;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Engine engineA;

//    @QualifierB
//    @Inject
//    Engine engineB;

    @Inject
    Engine engineC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMainActComponent.builder()
                .applicationComponent(MyApplication.getInstance().getApplicationComponent())
                .markEngineModule(new EngineModule("dd"))
                .build()
                .inject(this);

        engineA.run();

        //engineB.run();

        engineC.run();
    }
}
