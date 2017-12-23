package com.rainmaker;

public class Main {

    public static void main(String[] arg){
        URLify("We are going out");
    }

    private static void URLify(String s) {
        // quick solution
        String nS = s.replace(" ", "%20");

        //more complex solution

//        char[] sChars = s.toCharArray();
//        StringBuilder nS = new StringBuilder();
//        char spaceCh = " ".charAt(0);
//	    for (int i = 0; i < s.length(); i++) {
//	        if (sChars[i] == spaceCh ) {
//	            nS.append("%20");
//            } else  {
//	            nS.append(sChars[i]);
//            }
//        }
        System.out.print(nS);
    }
}
