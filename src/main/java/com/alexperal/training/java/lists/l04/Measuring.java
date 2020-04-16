package com.alexperal.training.java.lists.l04;

import java.util.concurrent.TimeUnit;

public class Measuring {

    public static final int ITERATIONS = 5;

    public static void weWantToMeasureThis() {
        for (int i = 0; i < 100000000; i++) {
            i += Math.abs(1);
        }
    }

    static void printTime(long time, TimeUnit unit) {
        System.out.println("It took " + unit.toMillis(time) + " ms to execute");
    }

    public static void main(String[] args) {
        measure1();
        /*measure2();
        measure3();
        measure4();
        measure5();*/
    }

    private static void measure1() {
        long l = System.currentTimeMillis();
        weWantToMeasureThis();
        long time = System.currentTimeMillis() - l;
        printTime(time, TimeUnit.MILLISECONDS);
    }

    private static void measure2() {
        long l = System.nanoTime();
        weWantToMeasureThis();
        long time = System.nanoTime() - l;
        printTime(time, TimeUnit.NANOSECONDS);
    }

    private static void measure3() {
        long l = System.nanoTime();
        performIteration();
        long time = System.nanoTime() - l;
        printTime(time / ITERATIONS, TimeUnit.NANOSECONDS);
    }

    private static void performIteration() {
        for (int i = 0; i < ITERATIONS; i++) {
            weWantToMeasureThis();
        }
    }

    private static void measure4() {
        performIteration();
        long l = System.nanoTime();
        performIteration();
        long time = System.nanoTime() - l;
        printTime(time / ITERATIONS, TimeUnit.NANOSECONDS);
    }

    private static void measure5() {
        for (int i = 0; i < 100; i++) {
            measure4();
        }
    }
}
