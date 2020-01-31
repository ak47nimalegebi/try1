package com.bawei6.usermodule;

import com.flyco.tablayout.listener.CustomTabEntity;

public class MyCustomTabEntity implements CustomTabEntity {

    private String name;


    public MyCustomTabEntity(String name) {
        this.name = name;
    }

    @Override
    public String getTabTitle() {
        return name;
    }

    @Override
    public int getTabSelectedIcon() {
        return 0;
    }

    @Override
    public int getTabUnselectedIcon() {
        return 0;
    }
}
