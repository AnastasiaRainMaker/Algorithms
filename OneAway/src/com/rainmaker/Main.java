package com.rainmaker;


public class Main {

    public static void main(String[] args) {
        String s1 = "asd";
        String s2 = "as";
        System.out.println(checkS(s1,s2));
    }

    private static boolean checkS(String s1, String s2) {
        int count = 0;
        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    count++;
                }
            }
            if (count == 0)  return true;

        }

        if (s2.length() < s1.length()) {
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }

        if ((s2.length() - s1.length()) == 1) {
            boolean dif = false;
            int i1 = 0;
            int i2 = 0;
            while (i1 < s1.length() && i2 < s2.length()) {
                if (s1.charAt(i1) != s2.charAt(i2)) {
                    if (i1 != i2) return false;
                    if (!dif) {
                        dif = true;
                    } else {
                        return false;
                    }
                    i2++;
                } else {
                    i1++;
                    i2++;
                }
            }

            return  true;
        }
        return false;
    }

}
