package com.rainmaker;

public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 6, 9 ,8, 10, 10};
        printNumbers(0, arr);
    }

    private static void printNumbers(int i, int[] arr) {
        System.out.println(arr[i]);
        if ( i < arr.length-1) {
            i++;
            printNumbers(i, arr);
        }
    }
}
