package com.lxj.dagger2.modules;

import com.lxj.dagger2.model.Age;
import com.lxj.dagger2.model.PeopleInfo;

import dagger.Module;
import dagger.Provides;

@Module/*(includes = {BModules.class})*/
public class PeopelModule {

    @Provides
    Age newAge() {
        return new Age();
    }

    @Provides
    PeopleInfo newPeopleInfo(Age age) {
        return new PeopleInfo(age);
    }
}
