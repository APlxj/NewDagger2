package com.lxj.dagger2.model;

import com.lxj.dagger2.utils.L;

public class PeopleInfo {

    private Age age;

    public PeopleInfo(Age age) {
        this.age = age;
    }

    public void show() {
        L.d("age:" + age.getNum());
    }
}
