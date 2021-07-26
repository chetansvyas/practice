package com.practice.algo.sorting;

public class SelectionSort implements Sortable {

    @Override
    public int[] sort(int[] input) {
    return sortInput(input);
    }

    private int[] sortInput(int input[]){
        for (int i=0;i<input.length-1;i++){
            for (int j=i+1;j<=input.length-1;j++){
                if(input[i] > input[j]){
                    swap(input,i,j);
                }
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
