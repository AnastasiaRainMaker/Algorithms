package com.rainmaker;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] ar = {4,1,5,2,7,5,8};
        for (int i = 0; i < ar.length-1; i++) {
            for(int k = 0; k < ar.length - i - 1; k++) {
                if (ar[k] > ar[k + 1]) {
                    int temp = ar[k];
                    ar[k] = ar[k + 1];
                    ar[k + 1] = temp;
                }
            }
        }
        print(ar);
    }

    private static void print(int[] ar) {
        for (int anAr : ar) {
            System.out.print(anAr + " ");
        }
    }
}
