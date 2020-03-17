package com.lxj.dagger2.app;

import android.app.Application;

import com.lxj.dagger2.components.AppComponent;
import com.lxj.dagger2.components.DaggerAppComponent;
import com.lxj.dagger2.modules.AppModule;
import com.lxj.dagger2.utils.L;

public class App extends Application {

    public static final String TAG = "Peopel";
    private static AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = DaggerAppComponent.builder().appModule(new AppModule(this)).build();
    }

    public void show() {
        L.d("App");
    }

    public void show1() {
        L.d("App1");
    }

    public static AppComponent getAppComponent() {
        return appComponent;
    }
}
