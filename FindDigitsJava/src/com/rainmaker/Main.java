package com.rainmaker;

public class Main {

    public static void main(String[] args) {
        int n = 12;
        int result = findDigits(n);
        System.out.println(result);
    }

    static int findDigits(int n) {
        String s = Integer.toString(n);
        int count = 0;
        int[] arr = new int[s.length()];
        for (int i = 0; i < s.length(); i++)
        {
            arr[i] = s.charAt(i) - '0';
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && n % arr[i] == 0) {
                count++;
            }
        }
        return count;
    }
}
