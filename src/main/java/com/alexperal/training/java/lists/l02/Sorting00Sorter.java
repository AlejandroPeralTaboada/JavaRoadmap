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
    void sort(MinimalIntList list);

}
