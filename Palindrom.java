package Leetcode;
import java.util.*;
class Palindrom {
    public static void main(String args[]){
        System.out.println(longestPalindrome("12344144")); // 44144
    }
    public static String  longestPalindrome(String s) {
        Map<Integer, String> mp = new HashMap<>();
        String temp = "";
        String sLong = ""; // 0
        String KS = "";
        int k = 0;

        for (int i = 0; i < s.length(); i++) { // babad
            int tempL = s.length();
            for (int j = i; j < tempL; ) {
                temp += Character.toString(s.charAt(j));
                if (j == tempL - 1 && tempL != 0) {
                    j = i;
                    tempL--;
                    KS = temp;
                    k++;
                    mp.put(k, KS);

                    temp = "";
                } else {
                    j++;
                }


            }
//            k++;
            mp.put(k, KS);
            temp = "";
        }
        for (int i = 1; i <= mp.size(); i++) {
            // checking if it palin

            temp = mp.get(i); // bab
            if (isPalin(temp)) {
                if (sLong.length() < temp.length()) { // compare the two string
                    sLong = temp;
                    // sLong = "BAB"--> / ABA
                }

            }
            temp = "";
        }

        return sLong;

    }


    public static boolean isPalin(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i != s.length()) {
            if (s.charAt(i++) != s.charAt(j--))
                return false;
        }
        return true;

    }
}
