package com.dagger2demo.entity;


import android.content.Context;
import android.util.Log;

import javax.inject.Inject;

public class Engine {

    private String gear;
    private Context context;

    @Inject
    Engine(Context context,String gear){
        this.gear=gear;
        this.context=context;
        Log.d("tag","创建有参数的engine");
    }

//    @Inject
//    Engine(){
//        Log.d("tag","创建无参数的engine");
//    }

    public void run(){
        Log.d("tag","引擎运转起来了");
    }
}
