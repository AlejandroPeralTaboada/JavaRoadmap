package com.alexperal.training.java.basic.b04;

public class OoClass {

    private int id2;
    private String name;

    public OoClass(int id, String name) {
        this.id2 = id;
        this.name = name;
    }

    String computeIdentifier() {
        return id2 + name;
    }

    void changeName(String name) {
        this.name = name.toUpperCase();
    }
}
