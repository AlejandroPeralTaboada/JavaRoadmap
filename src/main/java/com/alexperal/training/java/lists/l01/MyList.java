package com.alexperal.training.java.lists.l01;

import java.util.concurrent.ThreadLocalRandom;


public class MyList implements MinimalIntList {

    private int[] list = new int[16];
    private int length = 0;

    @Override
    public int length() {
        return length;
    }

    @Override
    public boolean isEmpty() {
        return length == 0;
    }

    @Override
    public void add(int value) {
        if (length == list.length) {
            int[] placeHolder = new int[list.length];
            System.arraycopy(list, 0, placeHolder, 0, length);
            list = new int[list.length * 2];
            System.arraycopy(placeHolder, 0, list, 0, placeHolder.length);
        }
        list[length] = value;
        length++;
    }
    /*
        - counter variable for list array
        - increase the array size by one
        - if were at the index to be inserted
        - use the value variable
        - otherwise copy an index from the array
        - increment the counter variable
     */

    @Override
    public int get(int index) {
        assertIndex(index);
        return list[index];
    }

    @Override
    public void set(int index, int value) {
        assertIndex(index);
        list[index] = value;
    }

    @Override
    public int remove(int index) {
        int removedValue = list[index];
        final int listLength = list.length;
        assertIndex(index);
        if(length == 0) {
            throw new ArrayIndexOutOfBoundsException("Unknown index");
        }
        int[] placeHolder;
        if(index == length - 1) {
            length--;
            placeHolder = new int[length];
            System.arraycopy(list, 0, placeHolder, 0, length);
            list = new int[listLength];
            System.arraycopy(placeHolder, 0, list, 0, length);
            return removedValue;
        }
        else {
            int listCounter = 0;
            length--;
            placeHolder = new int[length];
            for(int i = 0; i < length; i++) {
                if(i == index) {
                    listCounter++;
                }
                placeHolder[i] = list[listCounter];
                listCounter++;
            }
            list = new int[listLength];
            System.arraycopy(placeHolder, 0, list, 0, length);
        }
        return removedValue;
    }

    private void assertIndex(int index) {
        if (index > length || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Unknown index");
        }
    }
}
