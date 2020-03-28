package com.alexperal.training.java.basic.b05;

public class Conditionals {

    private static String ifElse(String s) {
        if (s.equals("Hi")) {
            return "Hello";
        } else if (s.equals("Bye")) {
            return "Bye";
        } else {
            return "Nothing";
        }
    }

    public static void main(String[] args) {
        System.out.println(ifElse("Hi"));
        System.out.println(ifElse("Bye"));
        System.out.println(ifElse("hi"));
    }
}
