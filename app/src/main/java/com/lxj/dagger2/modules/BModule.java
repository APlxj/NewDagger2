package com.lxj.dagger2.modules;

import com.lxj.dagger2.model.Weight;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class BModule {

    @Singleton
    @Provides
    Weight newWeigth() {
        return new Weight();
    }

}
