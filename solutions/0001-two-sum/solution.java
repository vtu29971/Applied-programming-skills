class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i = 0 , j = 0;
        int [] r = {i,j};
        for(i =0 ; i <= nums.length -1 ; i++){
            for(j = i; j <= nums.length -1 ; j++) {
                if(i!=j){
                if(nums[i]+nums[j] == target){
                    r[0]=i;
                    r[1]=j;
                    break;
                }
                }
            }
        }
        return r;
    }
}
