package com.lxj.dagger2.model;

import com.lxj.dagger2.utils.L;

public class Age {

    private double num = 25;

    public double getNum() {
        return num;
    }

    public void show() {
        L.d(String.valueOf(num));
    }
}
