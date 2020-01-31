package com.bawei6.conultsactivity;

import com.flyco.tablayout.listener.CustomTabEntity;

public class MyCustomTabEntity implements CustomTabEntity {

    private String name;
    private int sele;
    private int unsele;

    public MyCustomTabEntity(String name, int sele, int unsele) {
        this.name = name;
        this.sele = sele;
        this.unsele = unsele;
    }

    @Override
    public String getTabTitle() {
        return name;
    }

    @Override
    public int getTabSelectedIcon() {
        return sele;
    }

    @Override
    public int getTabUnselectedIcon() {
        return unsele;
    }
}
