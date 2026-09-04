class Solution {
    public int firstStableIndex(int[] nums, int k) {


        for ( int i = 0 ; i <= nums.length -1 ; i++){

        int max = nums[0];
        int min = nums[nums.length -1];

            for(int j = 0 ; j <= i ; j++){
                max = Math.max(max, nums[j]);
            }

            for(int j = i ; j <= nums.length-1 ; j++){
                min = Math.min(min , nums[j]);
            }

            if((max - min) <= k){
                return i;
        }
        }
        return -1;
    }
}
