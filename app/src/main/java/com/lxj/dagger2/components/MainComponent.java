package com.lxj.dagger2.components;

import com.lxj.dagger2.MainActivity;
import com.lxj.dagger2.modules.BModule;
import com.lxj.dagger2.modules.PeopelModule;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {PeopelModule.class, BModule.class}/*, dependencies = {AppComponent.class}*/)
public interface MainComponent {

    void inject(MainActivity activity);

}
