package com.alexperal.training.java.lists.l02;

import com.alexperal.training.java.lists.l01.MinimalIntList;

/**
 * Interface for sort strategies for {@link MinimalIntList}
 */
public interface Sorting00Sorter {

    /**
     * Sorts the list modifying the provided one
     * @param list the list to be sorted
     */
    MinimalIntList sort(MinimalIntList list);

    /**
     * Checks if list is sorted
     * @param list the list after it goes through sorted method
     */
    boolean isSorted(MinimalIntList list);
}
