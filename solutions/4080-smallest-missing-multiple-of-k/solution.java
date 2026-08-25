class Solution {
    public int missingMultiple(int[] nums, int k) {

        for(int i = 1 ;  ; i++  ){
            boolean flag = false;
            for(int x : nums){
                if(x == k*i){
                    flag = true;
                    break;
                }
            }
if (!flag) return i*k;
        }
    // return nums[0]*2;
    }
}
