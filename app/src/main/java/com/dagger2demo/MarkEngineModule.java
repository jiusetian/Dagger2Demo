package com.dagger2demo;

import dagger.Module;
import dagger.Provides;

@Module
public class MarkEngineModule {

    private String gear;

    public MarkEngineModule(String gear){
        this.gear=gear;
    }


    //@QualifierA //代表自定义注解，在依赖需求者中，有此注解的变量用这个方法进行提供赋值
    @Provides //代表提供者
    @CarScope //可以实现局部单例
    String provideEngineA(){
        return gear;
    }

//    @QualifierB
//    @Provides
//    Engine provideEngineB(){return new Engine();}

}
