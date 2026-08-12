class Solution {
    public void moveZeroes(int[] nums) {
        
        int i ,j = 0, temp ;

        for( i = 0 ; i < nums.length ; i++){
            
                if(nums[i] != 0){

                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;

                    j++; 
            }
        }


        
    }
}
