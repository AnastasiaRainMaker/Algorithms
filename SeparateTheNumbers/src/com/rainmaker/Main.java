package com.rainmaker;

public class Main {

    public static void main(String[] args) {
        String s = "121314";
        String testStr;
        for (int i = 1; i <= s.length()/2; ++i) {
            long first = Long.parseLong(s.substring(0,i));
            long test = first;
            testStr = String.valueOf(test);
            while(testStr.length() < s.length()) {
                testStr += String.valueOf(++test);
            }
            if(s.equals(testStr)) {
                System.out.println("YES " + first);
                return;
            }
        }
        System.out.println("NO");
    }
}
