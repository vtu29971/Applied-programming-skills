class Solution {
    public int minOperations(int[] nums, int x) {


        int total = 0;
        for(int n : nums) total += n;


// EDGE CASES
        if((total - x) < 0) return -1;
        else if(total - x == 0) return nums.length;
// 


        int i = 0 ;
        int left = nums[i] , right = 0;

        int sum = 0;
        int maxLen = -1;

        for(int a = 0 ; a < nums.length ; a++){

            sum += nums[a];
        

            while(!(sum <= (total-x))){
                    left = nums[i++];
                    sum -= left;
                    
            }

            if(sum == (total-x)) maxLen = Math.max(maxLen , (a - i+1));

        }

        return (maxLen == -1) ? -1 : (nums.length - maxLen);
    }
}
