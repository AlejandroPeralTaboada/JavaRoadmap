package com.alexperal.training.java.lists.l01;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.*;

class TestListTest {

    private TestList list;

    @BeforeEach
    private void createList() {
        list = new TestList();
    }

    @Test
    public void emptiness(){
        assertTrue(list.isEmpty());
        list.add(1);
        assertFalse(list.isEmpty());
        list.remove(0);
        assertTrue(list.isEmpty());
    }

    @Test
    public void myTest() throws InterruptedException {

        assertTrue(list.isEmpty());
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        assertFalse(list.isEmpty());
        assertEquals(100, list.length());
        assertEquals(95, list.get(95));
        list.set(95, 0);
        assertEquals(0, list.get(95));
        for (int i = 0; i < 100; i++) {
            list.remove(ThreadLocalRandom.current().nextInt(0, 100 - i));
        }
        assertTrue(list.isEmpty());
        for (int i = 0; i < 100; i++) {
            list.add(-i);
            list.add(0);
        }
        assertEquals(200, list.length());
        assertEquals(-50, list.get(100));
        assertEquals(0, list.get(101));
        for (int i = 0; i < list.length(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        assertEquals(-50, list.remove(100));
        for (int i = 0; i < list.length(); i++) {
            System.out.print(list.get(i) + " ");
        }
        assertEquals(0, list.get(102));
        while (!list.isEmpty()) {
            list.remove(0);
        }
        assertTrue(list.isEmpty());
        assertEquals(0, list.length());
    }
}