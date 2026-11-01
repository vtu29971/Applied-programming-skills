class Solution {
    public int minMoves(int[] nums) {

        int sum = 0;
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        for(int a : nums){
            sum += a;
            min = Math.min(min , a);
        }
        return sum-n*min;
    }
}
