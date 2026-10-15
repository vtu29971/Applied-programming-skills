class Solution {
    public int[] leftRightDifference(int[] nums) {

        int n = nums.length;

        int[] leftSumArr = new int[n];
        int[] rightSumArr = new int[n];
        int[] resultArr = new int[n];



        for(int i = 0 ; i < n ; i++){

        int leftSum = 0 ;
        int rightSum = 0 ; 

            for(int j = 0 ; j < i ; j++){
                leftSum += nums[j];
            }
            leftSumArr[i] = leftSum;

            for(int j = n-1 ; j > i ; j--){
                rightSum += nums[j];
            }
            rightSumArr[i] = rightSum;
        }

        for(int i = 0 ; i < n ; i++){
            resultArr[i] = Math.abs(leftSumArr[i]-rightSumArr[i]);
        }


    return resultArr;
    }
}
