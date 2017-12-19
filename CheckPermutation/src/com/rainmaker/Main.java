//the first solution

package com.rainmaker;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    String s1 = "absbs";
	    String s2 = "abssb";
	    if (isPermutation(s1,s2)){
	        System.out.print("The strings are permutations");
	    } else {
            System.out.print("The strings are not permutations");

        }

    }
    //create char arrays out of strings and then sort them;
    private static String sortStr(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
    // if the length of the strings are different then they cannot be permutations and return false;
    private static boolean isPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        } else {
    // if sorted strings are equal this means they are permutations;
            return sortStr(s1).equals(sortStr(s2));
        }
    }
}
//
////the second solution
//
//package com.rainmaker;
//
//public class Main {
//
//    public static void main(String[] args) {
//        String s1 = "absbs";
//        String s2 = "abssb";
//        if (isPermutation(s1,s2)){
//            System.out.print("The strings are permutations");
//        } else {
//            System.out.print("The strings are not permutations");
//
//        }
//
//    }
//    // first check if the length of the strings are equal;
//    //then count all the appearances of the chars in string1;
//    // after that start reducing the count comparing to string 2;
//
//    private static boolean isPermutation(String s1, String s2) {
//        if (s1.length() != s2.length()) {
//            return false;
//        } else {
//            int[] chars = new int[128];
//            char[] s_chars = s1.toCharArray();
//            for (char c : s_chars) {
//                chars[c]++;
//            }
//            for (int i = 0; i < s2.length(); i++) {
//                int c = s2.charAt(i);
//                chars[c]--;
//                if (chars[c] < 0) {
//                    return false;
//                }
//            }
//        } return true;
//    }
//}
