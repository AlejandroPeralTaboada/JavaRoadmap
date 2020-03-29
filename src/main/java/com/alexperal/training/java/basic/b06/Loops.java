package com.alexperal.training.java.basic.b06;

import java.time.LocalDate;
import java.util.List;

public class Loops {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i);
        }
        System.out.println();

        for (Integer integer : List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)) {
            System.out.print(integer);
        }
        System.out.println();

        int i = 0;
        while (i < 10) {
            System.out.print(i);
            i++;
        }
        System.out.println();


        i = 0;
        do {
            System.out.print(i);
            i++;
        } while (i < 10);
        System.out.println();

        LocalDate today = LocalDate.now();
        LocalDate nextWeek = LocalDate.now().plusDays(7);
        for (LocalDate weekDay = today; weekDay.isBefore(nextWeek); weekDay = weekDay.plusDays(1)) {
            System.out.println(weekDay.getDayOfWeek().name());
        }

    }
}
