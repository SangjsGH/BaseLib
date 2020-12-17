package com.scrb.baselib.entity;

public class UpdateEvent {

    private int id;

    public UpdateEvent(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}