package com.rainmaker;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {1,4,2,7,8,5,12,6};
        sort(arr,0, arr.length-1);
        print(arr);
    }

    private static void print(int[] arr) {
        for(int in : arr) {
            System.out.print(in + " ");
        }
    }

    private static void sort(int[] arr, int start, int finish) {
        if(start < finish) {
            int pi = partition(arr, start, finish);
            sort(arr, start, pi - 1);
            sort(arr, pi + 1, finish);
        }
    }

    private static int partition(int[] arr, int start, int finish) {
        int i = start-1;
        int p = arr[finish];
        for(int j = start; j < finish; j++) {
            if (arr[j] <= p) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;

            }
        }
        int temp = arr[i+1];
        arr[i + 1] = arr[finish];
        arr[finish] = temp;
        return i+1;
    }


}
