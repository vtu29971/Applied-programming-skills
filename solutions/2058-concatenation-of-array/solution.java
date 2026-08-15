class Solution {
    public int[] getConcatenation(int[] nums) {

        int[] newnums = new int [nums.length*2];
        for(int i = 0 ; i < nums.length ; i++){
            newnums[i] = nums[i];
            newnums[nums.length+i] = nums[i];
        }
        return newnums;
    }
}
