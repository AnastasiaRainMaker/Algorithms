package com.rainmaker;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 14 ,5 ,6,7, 8 ,9, 10, 1};
        int n = arr.length;
        int temp;
        for (int i = 1; i < n; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j-1]) {
                    temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
