package com.rainmaker;

import java.util.Arrays;
//this algorithms is case sensitive and also counts write spaces as chars;

public class Main {

    public static void main(String[] args) {
        String test = "Checking";
            if (isUnique(test)) {
                System.out.println(test + " has all unique chars");
            } else {
                System.out.println(test + " does not have all unique chars");
        }

    }
    private static boolean isUnique(String str) {
        int max_count = 256;
        boolean[] chars = new boolean[max_count];
        Arrays.fill(chars,false);
        if (str.length() > 256) {
            return false;
        }
        for (int i = 0; i < str.length(); i++){
            if (!chars[str.charAt(i)]){
                chars[str.charAt(i)] = true;
            } else {
                return false;
            }
        }
        return true;
    }
}
