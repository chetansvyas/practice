package com.practice.algo.sorting;

public class BubbleSort implements Sortable {

    @Override
    public int[] sort(int[] input) {
    return sortInput(input);
    }

    private int[] sortInput(int input[]){
        for (int i=0;i<input.length-2;i++){
            boolean isSwaped = false;
            for (int j=0;j< input.length-1;j++){
                if(input[j+1] < input[j]){
                    swap(input,j+1,j);
                    isSwaped = true;
                }
            }
            if(!isSwaped){
                break;
            }
            print(input);
        }
        return input;
    }

    private void swap(int arr[],int a, int b){
        arr[a] = arr[a]+arr[b];
        arr[b] = arr[a]-arr[b];
        arr[a] = arr[a]-arr[b];
    }

    private void print(int[] input){
        for (int i: input)
        System.out.print(i + ",");
        System.out.println();
    }
}
