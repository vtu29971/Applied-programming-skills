class Solution {
    public int numIdenticalPairs(int[] nums) {

        int len = nums.length;
        int[] list = new int[101];
        int ans = 0;

        for(int n : nums){
            list[n]++;
        }
        for(int n : list){
            ans+= (n*(n-1))/2;
        }
        return ans;
    }
}
