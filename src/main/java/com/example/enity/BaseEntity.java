package com.example.enity;


public abstract class BaseEntity {

    public boolean getIsNewRecord () {
        return isNewRecord;
    }

    protected boolean isNewRecord = false;
}
