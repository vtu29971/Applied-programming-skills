class Solution {
    public int maxArea(int[] height) {
        int max = 0;
        int l = 0;
        int r = height.length - 1;

        while(l < r){

            int store = (r-l) * Math.min(height[l] , height[r]);
            max = Math.max(max , store);
            
            if(height[l] < height[r]){
                l++; 
            }
            else{
                r--;
            }

        }
    return max;
    }
}
