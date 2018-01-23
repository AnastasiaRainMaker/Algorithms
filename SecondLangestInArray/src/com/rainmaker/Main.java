package com.rainmaker;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
     int[] arr = {1, 4, 6, 6, 9 ,8, 10, 10};
	 int result = findSecondLargest(arr);
	 System.out.println(result);
    }

    private static int findSecondLargest(int[] arr) {
        Arrays.sort(arr);
        int num = 0;
        int n = arr.length;
        for (int i = n-1; i >= 0; i--) {
           if (arr[i] > arr[i-1]) {
               num = arr[i-1];
               break;
           }
        }
        return num;
    }
}
