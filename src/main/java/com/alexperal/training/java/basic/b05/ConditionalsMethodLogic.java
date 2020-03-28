package com.alexperal.training.java.basic.b05;

public class ConditionalsMethodLogic {


    private static String greet(String name, boolean isWelcome) {
        if (isWelcome) {
            return "Hello " + name;
        } else {
            return "Bye " + name;
        }
    }

    enum GreetType {
        WELCOME, BYE
    }

    private static String enhancedGreet(String name, GreetType isWelcome) {
        String greet = switch (isWelcome) {
            case WELCOME -> "Hello ";
            case BYE -> "Bye ";
        };
        return greet + name;
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

    static String greetSomeone(PolymorphicGreet greeting, String name) {
        return greeting.greet(name);
    }

    public static void main(String[] args) {
        System.out.println(greet("Alex", true));
        System.out.println(greet("Alex", false));

        System.out.println(enhancedGreet("Alex", GreetType.WELCOME));
        System.out.println(enhancedGreet("Alex", GreetType.BYE));

        System.out.println(new WelcomeGreet().greet("Alex"));
        System.out.println(new ByeGreet().greet("Alex"));

        System.out.println(greetSomeone(new WelcomeGreet(), "John"));
        System.out.println(greetSomeone(new ByeGreet(), "John"));

    }
}
