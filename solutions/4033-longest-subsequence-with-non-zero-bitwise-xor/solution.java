class Solution {
    public int longestSubsequence(int[] nums) {
    
        int n = nums.length;
        int x = 0;
        boolean Zero = true;
        for(int num : nums){
            x = x^num;
            if(num != 0){//bass ek bhi non zero mil jaye
            Zero = false;
            }
        }
        if(Zero){
            return 0;
        }
        if(x == 0){
           return n = n-1 ;
        }
        else{
            return n;
        }
        

        
    }
}
