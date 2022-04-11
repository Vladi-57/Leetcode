package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Roman2Int {

    public static void main(String arg[]){
        System.out.println(romanToInt("III")); // 3
        System.out.println(romanToInt("LVIII")); // 58
        System.out.println(romanToInt("MCMXCIV")); // 1994
        Map<Character, Integer> Mp = new HashMap<>();
        Mp.put('I', 1);
        Mp.put('V', 5);
        Mp.put('X', 10);
        String s = "IV";
//        int x = 0;
//        for(int i = 0; i < s.length(); i++){
//            x += Mp.get(s.charAt(i));
//        }
//        System.out.println(x);
    }

    public static int romanToInt(String s) {
        int res = 0;
        Map<Character, Integer>r2i = new HashMap<>();
        /////////////////////////////////////////////////////////
        r2i.put('I', 1);
        // I - V = IV
        r2i.put('V', 5);
        // IX = 9
        r2i.put('X', 10);
        r2i.put('L', 50);
        r2i.put('C', 100);
        r2i.put('D', 500);
        r2i.put('M', 1000);
        ////////////////////////////////////////////////////////
        for(int i = 0; i < s.length() - 1; i++)
        {
            if(r2i.get(s.charAt(i)) < r2i.get(s.charAt(i + 1))){
            }
            else {
                res += r2i.get(s.charAt(i)); // crabing
            }

        }

        return  res;
    }
}
