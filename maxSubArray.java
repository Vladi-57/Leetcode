package Leetcode;

import java.util.Collections;

public class maxSubArray {
    public static void main(String[] args){
        System.out.println(maxSunarraySum(new int[]{1, 2, 5,2,8, 1, 5}, 2)); // 10
        System.out.println(maxSunarraySum(new int[]{1, 2, 5,2, 8, 1, 5}, 4)); // 17
        System.out.println(maxSunarraySum(new int[]{4,2,1,6}, 1)); // 6
        System.out.println(maxSunarraySum(new int[]{4,2,1,6,2}, 4)); // 13
        System.out.println(maxSunarraySum(new int[]{}, 4)); // empty
    }
    public static int maxSunarraySum(int arr[], int n){
        int  maxSumb = 0;
        int temp = 0;

                     //  7
            // i = 0, 3, 6 ;
        int T = arr.length - 1;
        // 0 1
            for(int i = 0; i<arr.length - 1; i++){
                temp = 0;
                int tempI = i; // tempI  = 0
                for (int j = 0; j<n; j++){ // j = 1;
                    temp += arr[i];
                        i++; //  i = 2;  //

                }
                if(temp > maxSumb){
                    maxSumb = temp;
                }
                i = tempI;

//
            }




        return maxSumb;
    }
}
