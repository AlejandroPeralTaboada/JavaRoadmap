package com.alexperal.training.java.basic.b02;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GetClassMethod {

    static class MyClass {
        int i;

        public MyClass(int i) {
            this.i = i;
        }
    }

    public static void main(String[] args) throws IllegalAccessException {
        MyClass o = new MyClass(1);
        System.out.println("My variable O ");
        Class<?> aClass = o.getClass();
        System.out.println(aClass);
        System.out.println(Arrays.toString(aClass.getDeclaredMethods()));
        Field[] declaredFields = aClass.getDeclaredFields();
        Field declaredField = declaredFields[0];
        MyClass o1 = new MyClass(2);
        System.out.println(declaredField.get(o1));
    }
}
