package com.alexperal.training.java.basic.b04;

import java.util.concurrent.ThreadLocalRandom;

public class ServiceClass {

    public PojoClass result() {
        String s = "something";
        int id = ThreadLocalRandom.current().nextInt();
        OoClass ooClass = new OoClass(id, s);
        ooClass.changeName("New Name");
        String s1 = ooClass.computeIdentifier();
        return new PojoClass(id, s1);
    }

    public static void main(String[] args) {
        System.out.println("The Result is: " + new ServiceClass().result());
    }
}
