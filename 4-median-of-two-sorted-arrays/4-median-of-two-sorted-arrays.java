class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       double count = 0.0;
        int n = nums1.length;
        int m = nums2.length;
        int arr[] = new int[n+m];
        int temp = 0;
        double mid = 0;
        for(int i = 0; i < nums1.length; i++)
        {
            arr[i] = nums1[i];
        }
        for(int j  = 0; j <nums2.length; j++){
           arr[nums1.length + j] = nums2[j];
        }
//        for(int i =0; i<arr.length; i++){
//
//            if(arr[i] > arr[arr.length-1])
//            {
//                temp = arr[i];
//                arr[i] = arr[i+1];
//                arr[i+1]  = temp;
//            }
//        }
        Arrays.sort(arr);
        int median = arr.length/2;
        int oddMedian = (arr.length/2) - 1;
        mid = arr.length % 2;
        if(mid != 0) {
            count = arr[median];
            return  count;
        } else {

            count = (double) (arr[median] + arr[oddMedian]) / 2;
            return count;
        }
        
    }
}