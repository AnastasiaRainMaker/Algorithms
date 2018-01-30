package com.rainmaker;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        String s = "aaabbbb";
        char[] sAr = s.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        boolean isOdd = false;
        for (char c : sAr) {
            if (map.get(c) == null || map.get(c) == 0)
                map.put(c, 1);
            else {
                Integer count = map.get(c);
                count++;
                map.put(c, count);
            }
        }
        for (Integer value : map.values()) {
            if (value % 2 != 0 && !isOdd) {
                isOdd = true;
            } else if (value % 2 != 0 && isOdd) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }

}
