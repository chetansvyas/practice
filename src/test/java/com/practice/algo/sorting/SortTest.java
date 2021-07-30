package com.practice.algo.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SortTest {

    @Test
    public void test() {
        int[] arr = new int[]{40, 20, 30, 80, 60, 90, 50, 10, 100, 70};
        Sortable bubbleSort = new BubbleSort();
        int[] expectedOutput = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        Assertions.assertArrayEquals(expectedOutput, bubbleSort.sort(arr));

        Sortable selectionSort = new SelectionSort();
        Assertions.assertArrayEquals(expectedOutput, selectionSort.sort(arr));

        Sortable insertionSort = new InsertionSort();
        Assertions.assertArrayEquals(expectedOutput, insertionSort.sort(arr));

        Sortable quickSort = new QuickSort();
        Assertions.assertArrayEquals(expectedOutput, quickSort.sort(arr));

        Sortable mergeSort = new MergeSort();
        Assertions.assertArrayEquals(expectedOutput, mergeSort.sort(arr));
    }
}