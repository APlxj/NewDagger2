package com.lxj.dagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.lxj.dagger2.app.App;
import com.lxj.dagger2.components.DaggerMainComponent;
import com.lxj.dagger2.model.Age;
import com.lxj.dagger2.model.PeopleInfo;
import com.lxj.dagger2.model.Weight;
import com.lxj.dagger2.utils.L;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    Age age;

    @Inject
    PeopleInfo info;

    @Inject
    Weight weight;

    @Inject
    Weight weight1;

    @Inject
    App app;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DaggerMainComponent
                .builder()
                .build()
                .inject(this);

        age.show();

        info.show();

        weight.show();

        L.d(weight.toString());
        L.d(weight1.toString());

        app.show();
    }
}
