package com.alexperal.training.java.lists.l02;

import com.alexperal.training.java.lists.l01.MinimalIntList;
import com.alexperal.training.java.lists.l01.MyList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Sorting02SelectionSortTest {
    @Test
    public void sortEmptyList() {
        MinimalIntList list = new MyList();
        //sort(MinimalIntList list)
    }

    @Test
    public void unsortedList() {
        MinimalIntList list = new MyList();
        Sorting00Sorter selectionSort = new Sorting02SelectionSort();
        list.add(5);
        list.add(1);
        list.add(9);
        list.add(3);
        list.add(4);
        assertFalse(selectionSort.isSorted(list));
    }

    @Test
    public void singleList() {
        //sort(MinimalIntList list)
    }

    @Test
    public void regularList() {
        MinimalIntList list = new MyList();
        Sorting00Sorter selectionSort = new Sorting02SelectionSort();
        list.add(5);
        list.add(1);
        list.add(9);
        list.add(3);
        list.add(4);
        MinimalIntList sortedList = selectionSort.sort(list);
        assertTrue(selectionSort.isSorted(sortedList));
    }
}
