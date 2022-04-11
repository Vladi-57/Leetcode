package Leetcode;

public class Palindrome {
    public static void main(String args[]){
        System.out.print(isPalindrome(515));
    }
    public static boolean isPalindrome(int x) {

        String s = String.valueOf(x);
        String s1 = "";
        if(x < 0){
            return false;
        }
        else {
            if(s.charAt(0) != s.charAt(s.length() - 1))
                return false;
            else {
                for (int i = s.length() - 1; i >= 0; i--) {
                    s1 += s.charAt(i);
                }
                int S = Integer.parseInt(s1);

                return x == S;
            }
        }
    }
}
