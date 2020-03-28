package com.alexperal.training.java.basic.b02;

public class HashCodeMethod {

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
        public String toString() {
            return "MyClass2{" +
                    "i=" + i +
                    '}';
        }
    }

    static record MyRecord(int i) {
    }

    public static void main(String[] args) throws IllegalAccessException {
        MyClass o1 = new MyClass(1);
        System.out.println("My variable o1 is printed as: '" + o1 + "' because to String method is not overwritten");
        System.out.println();
        System.out.println("My variable o1 classname is: " + o1.getClass());
        System.out.println("My variable o1 identity hash code is: " + System.identityHashCode(o1) + " witch in hexadecimal is " + Integer.toHexString(System.identityHashCode(o1)));
        System.out.println();
        MyClass2 o2 = new MyClass2(1);
        System.out.println("My variable o2 is printed as: '" + o2 + "' because to String method is overwritten");
        System.out.println();
        MyRecord o3 = new MyRecord(1);
        System.out.println("My variable o3 is printed as: '" + o3 + "' because it is a record");

    }
}
