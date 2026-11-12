class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int incount = 1;
        int maxin = 1;
        int maxed = 1;
        int decount = 1;
        for(int i = 1 ; i < n ; i++){
            if(nums[i-1] < nums[i]) incount++;
            else incount = 1;
            maxin = Math.max(maxin , incount);

            if(nums[i-1] > nums[i]) decount++;
            else decount = 1;
            maxed = Math.max(maxed , decount);  
        }
        return Math.max(maxed , maxin);
    }
}
