package com.alexperal.training.java.lists.l02;

import com.alexperal.training.java.lists.l01.MinimalIntList;
import com.alexperal.training.java.lists.l01.MyList;

/**
 * Splits the array in two and sorts each part
 * <p>
 * Then uses the two sorted arrays to merge them into the final one
 * <p>
 * https://en.wikipedia.org/wiki/Merge_sort
 */
public class Sorting04MergeSort implements Sorting00Sorter {


    @Override
    public MinimalIntList sort(MinimalIntList list) {
        if (list.isEmpty() || list.length() == 1) {
            return list;
        }
        MinimalIntList list1 = new MyList();
        MinimalIntList list2 = new MyList();
        for (int i = 0; i < list.length(); i++) {
            nextListToAdd(list1, list2, i).add(list.get(i));
        }
        list1 = sort(list1);
        list2 = sort(list2);
        for (int i = 0; i < list.length(); i++) {
            list.set(i, nextListRemove(list1, list2).remove(0));
        }
        return list;
    }

    public static MinimalIntList nextListToAdd(MinimalIntList list1, MinimalIntList list2, int index) {
        if (index % 2 == 0) {
            return list1;
        }
        return list2;
    }

    public static MinimalIntList nextListRemove(MinimalIntList list1, MinimalIntList list2) {
        if(list1.isEmpty()) {
            return list2;
        }
        if (list2.isEmpty()) {
            return list1;
        }
        if(list1.get(0) < list2.get(0)) {
            return list1;
        }
        return list2;
    }
}
