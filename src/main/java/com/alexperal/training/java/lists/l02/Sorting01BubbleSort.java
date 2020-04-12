package com.alexperal.training.java.lists.l02;

import com.alexperal.training.java.lists.l01.MinimalIntList;

import java.util.List;

/**
 * Sorts using the bubble sort algorithm.
 *
 * For each pair of elements in the list, swap then if they need to be sorted
 * Repeat until sorted
 *
 * https://en.wikipedia.org/wiki/Bubble_sort
 */
public class Sorting01BubbleSort implements Sorting00Sorter {


    @Override
    public MinimalIntList sort(MinimalIntList list) {
        if(list.length() <= 1) {
            return list;
        }
        for(int i = 0; i < list.length(); i++) {
            for(int j = 0; j < list.length() - 1; j++) {
                if(list.get(j) > list.get(j + 1)) {
                    int placeHolder = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, placeHolder);
                }
            }
        }
        return list;
    }
}
