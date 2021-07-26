package com.practice.algo.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortTest {

    @Test
    public void test() {
        int[] arr = new int[]{40,20, 30,80, 60, 90, 50,10,100, 70};
//        BubbleSort bubbleSort = new BubbleSort();
//        Assertions.assertArrayEquals(new int[]{10,20,30,40,50,60,70,80,90,100}, bubbleSort.sort(arr));
//
//        SelectionSort selectionSort = new SelectionSort();
//        Assertions.assertArrayEquals(new int[]{10,20,30,40,50,60,70,80,90,100}, selectionSort.sort(arr));

        InsertionSort insertionSort = new InsertionSort();
        Assertions.assertArrayEquals(new int[]{10,20,30,40,50,60,70,80,90,100}, insertionSort.sort(arr));
    }
}