package com.lxj.dagger2.app;

import android.app.Application;

import com.lxj.dagger2.components.AppComponent;
import com.lxj.dagger2.components.DaggerAppComponent;
import com.lxj.dagger2.utils.L;

public class App extends Application {

    public static final String TAG = "Peopel";
    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.create();
    }

    public void show() {
        L.d("App");
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}
