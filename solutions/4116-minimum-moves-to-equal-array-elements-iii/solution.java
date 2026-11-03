class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int max = nums[n-1];
        int move = 0;

        for(int i : nums){
            move += Math.abs(max - i);
        }
        return move;
    }
}
