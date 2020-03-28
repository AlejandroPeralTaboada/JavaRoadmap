package com.alexperal.training.java.basic.b04;

public class OoClass {

    private int id;
    private String name;

    public OoClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    String computeIdentifier() {
        return id + name;
    }

    void changeName(String name) {
        this.name = name.toUpperCase();
    }
}
