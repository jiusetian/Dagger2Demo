package com.dagger2demo;


import android.content.Context;

import javax.inject.Inject;

public class Glass {

    //
    private Context context;

    @Inject
    public Glass(Context context){
        this.context=context;
    }

}

