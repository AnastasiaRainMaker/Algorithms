package com.rainmaker;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String s = "I love coding";
        char[] sAr = s.toCharArray();
        reverse(sAr,0);

    }

    private static void reverse(char[] sAr, int i) {
        int n = sAr.length - 1;
        if (i != n - i && i < n - i) {
            char temp = sAr[i];
            sAr[i] = sAr[n-i];
            sAr[n-i] = temp;
            i++;
            reverse(sAr, i);

        } else
        System.out.println( Arrays.toString(sAr));
    }

}