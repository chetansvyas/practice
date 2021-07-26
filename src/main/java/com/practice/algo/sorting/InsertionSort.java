package com.practice.algo.sorting;

public class InsertionSort implements Sortable {

    @Override
    public int[] sort(int[] input) {
    return sortInput(input);
    }

    private int[] sortInput(int input[]){
        for (int i=0;i<=input.length-1;i++){
            int value = input[i];
            int index = i;
            while(index>0 && input[index-1] > value){
                input[index] = input[index-1];
                index--;
            }
            input[index] = value;
        }
        return input;
    }
}