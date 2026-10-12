class Solution {
    public int minimumOperations(int[] nums) {

        int n = nums.length;
        int sum = 0 , rem = 0;

        for(int i = 0; i < n ; i++){
            rem = (nums[i] % 3 == 0) ? 0 : 1;
            sum += rem; 
        }
        return sum;
    }
}
