package com.alexperal.training.java.lists.l01;

/**
 * An ordered collection of ints
 * @since 1.0-SNAPSHOT
 */
public interface MinimalIntList {

    /**
     * Returns the number of elements in this list.
     *
     * @return the number of elements
     */
    int length();

    /**
     * Returns {@code true} if this list contains no elements.
     *
     * @return {@code true} if this list contains no elements.
     */
    boolean isEmpty();

    /**
     * Appends the specified element to the end of this list
     *
     * @param value element to be appended to this list
     */
    void add(int value);

    /**
     * Returns the element at the specified position in this list.
     *
     * @param index index of the element to return
     * @return the int at the specified position in this list
     * @throws IndexOutOfBoundsException if the index is out of range
     *                                   ({@code index < 0 || index >= size()})
     */
    int get(int index);

    /**
     * Removes the element at the specified position in this list.
     * Shifts any subsequent elements to the left (subtracts one from their indices).
     * Returns the element that was removed from the list.
     *
     * @param index the index of the element to be removed
     * @return the element previously at the specified position     *
     * @throws IndexOutOfBoundsException if the index is out of range
     *                                   ({@code index < 0 || index >= size()})
     */
    int remove(int index);


}
