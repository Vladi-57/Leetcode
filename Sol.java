package Leetcode;

public class Sol {
    public static void main(String args[]) {
        System.out.println(maxSunarraySum(new int[]{1, 2, 5, 2, 8, 1, 5}, 2)); // 10
        System.out.println(maxSunarraySum(new int[]{1, 2, 5, 2, 8, 1, 5}, 4)); // 17
        System.out.println(maxSunarraySum(new int[]{4, 2, 1, 6}, 1)); // 6
        System.out.println(maxSunarraySum(new int[]{4, 2, 1, 6, 2}, 4)); // 13
        System.out.println(maxSunarraySum(new int[]{}, 4));

    }


    public static int maxSunarraySum(int arr[], int n){
        int maxSum = 0;
        int tempSum = 0;
        if (arr.length < n) return -1;

        for(int i = 0; i < n; i++){
            maxSum+=arr[ i];
        }
        tempSum = maxSum;
            // i = 2---> 7
        for(int i = n; i < arr.length; i++){
            tempSum = tempSum - arr[i - n] + arr[i]; //  3-1+5 =  7
            maxSum = Math.max(maxSum, tempSum);
        }
        return maxSum;
    }
}
