package com.alexperal.training.java.basic.b03;

public class ClassInterface {

    interface MyInterface {
        String myMethod1();

        default String myDefaultMethod() {
            return myMethod1().toUpperCase();
        }
    }

    abstract static class MyAbstractClass implements MyInterface {
        abstract String doMyMethod1();

        @Override
        public final String myMethod1() {
            return doMyMethod1().toLowerCase();
        }

    }

    static class MyClass extends MyAbstractClass {

        @Override
        String doMyMethod1() {
            return ":D";
        }
    }

    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        MyAbstractClass myClass1 = myClass;
        MyInterface myClass2 = myClass;

        System.out.println(myClass.myMethod1());
        System.out.println(myClass1.myMethod1());
        System.out.println(myClass2.myMethod1());
        System.out.println();
        System.out.println(myClass.myDefaultMethod());
        System.out.println(myClass1.myDefaultMethod());
        System.out.println(myClass2.myDefaultMethod());
    }
}
