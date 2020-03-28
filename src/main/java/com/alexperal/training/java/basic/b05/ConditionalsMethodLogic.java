package com.alexperal.training.java.basic.b05;

public class ConditionalsMethodLogic {


    private static String greet(String name, boolean isWelcome) {
        if (isWelcome) {
            return "Hello " + name;
        } else {
            return "Bye " + name;
        }
    }

    interface PolymorphicGreet {
        String greet(String name);
    }

    static class WelcomeGreet implements PolymorphicGreet {

        @Override
        public String greet(String name) {
            return "Hello " + name;
        }
    }

    static class ByeGreet implements PolymorphicGreet {

        @Override
        public String greet(String name) {
            return "Bye " + name;
        }
    }

    static String greetSomeone(PolymorphicGreet greeting, String name){
        return greeting.greet(name);
    }

    public static void main(String[] args) {
        System.out.println(greet("Alex", true));
        System.out.println(greet("Alex", false));

        System.out.println(new WelcomeGreet().greet("Alex"));
        System.out.println(new ByeGreet().greet("Alex"));

        System.out.println(greetSomeone(new WelcomeGreet(),"John"));
        System.out.println(greetSomeone(new ByeGreet(),"John"));

    }
}
