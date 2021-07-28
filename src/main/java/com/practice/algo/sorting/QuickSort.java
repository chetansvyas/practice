package com.practice.algo.sorting;

public class QuickSort implements Sortable {

    @Override
    public int[] sort(int[] input) {
        quickSort(input,0,input.length-1);
        return input;
    }

    private void  quickSort(int[] input, int start, int end){
        if(start< end){
            int pIndex = partition(input,start,end);
            quickSort(input,start, pIndex-1);
            quickSort(input,pIndex+1, end);
        }
    }

    private int partition(int[] input, int start, int end) {
        int pivotValue = input[end];
        int pivotIndex = start;
        for(int i = start; i<end;i++){
            if(input[i] <= pivotValue){
                swap(input,i,pivotIndex);
                pivotIndex++;
            }
        }
        swap(input,pivotIndex,end);
        return pivotIndex;
    }

    private void swap(int[] input, int a, int b) {
        int temp = input[a];
        input[a] = input[b];
        input[b] = temp;
    }
}
