package com.alexperal.training.java.basic.b02;

public class EqualsMethod {

    static class MyClass {
        int i;

        public MyClass(int i) {
            this.i = i;
        }
    }

    static class MyClass2 {
        int i;

        public MyClass2(int i) {
            this.i = i;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            MyClass2 myClass2 = (MyClass2) o;

            return i == myClass2.i;
        }

        @Override
        public int hashCode() {
            return i;
        }
    }

    static record MyRecord(int i) {
    }

    public static void main(String[] args) throws IllegalAccessException {
        MyClass c1 = new MyClass(1);
        MyClass c2 = new MyClass(1);
        System.out.println("Is variable c1 equals to c1: "+c1.equals(c1));
        System.out.println("Is variable c1 equals to c2: "+c1.equals(c2));
        System.out.println("Is variable c1 the same object as c1: "+(c1==c1));
        System.out.println("Is variable c1 the same object as c2: "+(c1==c2));
        System.out.println();

        MyClass2 c3 = new MyClass2(1);
        MyClass2 c4 = new MyClass2(1);
        System.out.println("Is variable c3 equals to c3: "+c3.equals(c3));
        System.out.println("Is variable c3 equals to c4: "+c3.equals(c4));
        System.out.println("Is variable c3 the same object as c3: "+(c3==c3));
        System.out.println("Is variable c3 the same object as c4: "+(c3==c4));
        System.out.println();

        MyRecord r1 = new MyRecord(1);
        MyRecord r2 = new MyRecord(1);
        System.out.println("Is variable r1 equals to r1: "+r1.equals(r1));
        System.out.println("Is variable r1 equals to r2: "+r1.equals(r2));
        System.out.println("Is variable r1 the same object as r1: "+(r1==r1));
        System.out.println("Is variable r1 the same object as r2: "+(r1==r2));
        System.out.println();


        System.out.println("Is variable c1 equals to c3: "+c1.equals(c3));
        System.out.println("Is variable c3 equals to c1: "+c3.equals(c1));
        System.out.println("Is variable c3 equals to r1: "+c3.equals(r1));
        System.out.println("Is variable r1 equals to c3: "+r1.equals(c3));
    }
}
