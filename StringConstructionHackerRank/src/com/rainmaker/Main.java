package com.rainmaker;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        String s = "adbdbd";
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            set.add(s.charAt(i));
        };
        System.out.print(set.size());
    }
}
