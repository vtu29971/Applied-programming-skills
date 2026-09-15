class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        // the idea is , 3 times pass ,
        //1st pass for lower elements
        //2nd for larger
        // and for elements with same values

        int n = nums.length;
        int[] list = new int[n];

        int left = 0;
        int right = n-1;    //both for the list array

        //1st pass
        for(int x : nums){
            if(x < pivot){
                list[left++] = x;
            }
        }
    // 2nd pass
        for(int i = n-1 ; i >= 0 ; i--){
            if(nums[i] > pivot){
                list[right--] = nums[i];
            }
        }

        // 3rd one , mainly to fill gap
        while(left <= right){
            list[left++] = pivot;
        }
        return list;
    }
}
