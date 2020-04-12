package com.alexperal.training.java.lists.l02;

import com.alexperal.training.java.lists.l01.MinimalIntList;

/**
 * Sorts using the bubble sort algorithm.
 *
 * Finds the min element in the list and places it at the begging of it
 * Repeats for each position until the end
 *
 * https://en.wikipedia.org/wiki/Selection_sort
 */
public class Sorting02SelectionSort implements Sorting00Sorter{

    @Override
    public MinimalIntList sort(MinimalIntList list) {
        if(list.isEmpty() || list.length() == 1) {
            return list;
        }
        for(int i = 0; i < list.length(); i++) {
            int currentMin = list.get(i);
            int minIndex = i;
            int newMinIndex = 0;
           for(int j = i; j < list.length(); j++) {
               if(list.get(j) < currentMin) {
                    currentMin = list.get(j);
                    newMinIndex = j;
               }
           }
           int temp = list.get(i);
           list.set(i, currentMin);
           list.set(newMinIndex, temp);
        }
        return list;
    }
}