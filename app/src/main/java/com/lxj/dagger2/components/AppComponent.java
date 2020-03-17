package com.lxj.dagger2.components;

import com.lxj.dagger2.app.App;
import com.lxj.dagger2.modules.AppModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    App getApp();
}
