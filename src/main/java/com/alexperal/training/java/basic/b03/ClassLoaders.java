package com.alexperal.training.java.basic.b03;

public class ClassLoaders {

    public static void main(String[] args) {
        System.out.println(ClassLoaders.class.getClassLoader());
        System.out.println(ClassLoaders.class.getClassLoader().getParent());
        System.out.println(ClassLoaders.class.getClassLoader().getParent().getParent());
        System.out.println(ClassLoader.getPlatformClassLoader());
        System.out.println(String.class.getClassLoader());

    }
}
