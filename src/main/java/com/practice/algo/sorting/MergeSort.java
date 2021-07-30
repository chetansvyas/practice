package com.practice.algo.sorting;

public class MergeSort implements Sortable {

    @Override
    public int[] sort(int[] input) {
        mergeSort(input);
        return input;
    }

    private int[] mergeSort(int[] input) {
        int inputSize = input.length;
        if (inputSize < 2) {
        return input;
        }
        int middle = inputSize/2;
        int[] left = new int[middle];
        int[] right = new int[inputSize-middle];
        for(int i= 0;i<middle;i++){
            left[i] = input[i];
        }
        for(int i= middle;i<inputSize;i++){
            right[i-middle] = input[i];
        }
        mergeArrays(mergeSort(left), mergeSort(right), input);
        return input;
    }

    private void mergeArrays(int[] left, int[] right, int[] input) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                input[k] = left[i];
                i++;
            } else {
                input[k] = right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            input[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            input[k] = right[j];
            j++;
            k++;
        }
    }
}