class Solution {
    public int removeElement(int[] nums, int val) {
        int k = nums.length;
//        int j = nums.length - 1;
        int i = 0;
        if(nums.length == 1 && nums[0] == val) {
            nums[0] = nums[k - 1];
            return 0;
        }

        while (i < k)
        {
            if(nums[i] == val)
            {
                k--;
                nums[i] = nums[k];

//                j--;

            }
            else {
                i++;
            }
        }
        return k;

        
    }
}