package com.rainmaker;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	String s = "qldldlqlqlwlwllwlwlqlwkepkdwedfkkoedf";
	removeDups(s);
    }

    private static void removeDups(String s){
        ArrayList<Character> result = new ArrayList<>();
        for (int i = 0; i < s.length()-1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                if (!result.contains(s.charAt(i))) {
                    result.add(s.charAt(i));
                }
            } else {
                if (!result.contains(s.charAt(i))) {
                    result.add(s.charAt(i));
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (Character aResult : result) {
            sb.append(aResult);
        }
        System.out.println(String.valueOf(sb));

    }

}
