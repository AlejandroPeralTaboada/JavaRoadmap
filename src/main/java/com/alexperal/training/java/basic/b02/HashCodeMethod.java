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
        MyClass o1 = new MyClass(1);
        System.out.println("My variable o1 is printed as: '" + o1 + "' because to String method is not overwritten");
        System.out.println();
        System.out.println("My variable o1 classname is: " + o1.getClass());
        System.out.println("My variable o1 identity hash code is: " + System.identityHashCode(o1) + " and self hash code is " + o1.hashCode());
        System.out.println();
        MyClass2 o2 = new MyClass2(1);
        System.out.println("My variable o2 is printed as: '" + o2.hashCode() + "' because to String method is overwritten");
        System.out.println();
        MyRecord o3 = new MyRecord(1);
        System.out.println("My variable o3 is printed as: '" + o3.hashCode() + "' because it is a record");

    }
}
