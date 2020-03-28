package com.alexperal.training.java.basic.b04;

import java.io.Serializable;

/**
 * Pojo: Plain Old Java Object
 * JavaBean: Reusable component
 * DTO: Data Transfer Object
 * VO: Value Object
 * <p>
 * Default Empty Constructor for easy instancing, (not a good argument anymore)
 * Implement Serializable
 * Getters and Setters for their fields
 * No business logic inside them
 */
public class PojoClass implements Serializable {

    private Integer id;
    private String name;

    public PojoClass() {
    }

    public PojoClass(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PojoClass pojoClass = (PojoClass) o;

        if (id != null ? !id.equals(pojoClass.id) : pojoClass.id != null) return false;
        return name != null ? name.equals(pojoClass.name) : pojoClass.name == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PojoClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
