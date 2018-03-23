package com.rainmaker;

public class Main {

    public static int res = 1;
    public static int n = 10;
    public static int[] temp = new int[n+1];

    public static void main(String[] args) {
        temp[0] = 0;
        temp[1] = 1;
        System.out.println(String.valueOf(countSum()));
    }

    public static int countSum () {
        for (int i = 2; i <= n; i++) {
           temp[i] = temp[i-1] + temp[i-2];
            res += temp[i];
        }
        return res;
    }
}
