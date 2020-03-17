package com.lxj.dagger2.modules;

import com.lxj.dagger2.app.App;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Singleton
    @Provides
    App newApp() {
        return new App();
    }
}
