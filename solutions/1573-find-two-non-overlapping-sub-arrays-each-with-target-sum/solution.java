class Solution {
    public int minSumOfLengths(int[] arr, int target) {
        int i = 0, j = 0;
        int n = arr.length;

        int[] minTillIdx = new int[n];
        int curSum = 0;
        Arrays.fill(minTillIdx , Integer.MAX_VALUE);

        int bestMinLen = Integer.MAX_VALUE;
        int result = Integer.MAX_VALUE;

        while(j < n){
            curSum = curSum + arr[j];
            while(i<j && curSum > target){
                curSum -= arr[i];
                i++;
            }
            if(curSum == target){
                int len = j-i+1;

                if(i > 0 && minTillIdx[i-1] != Integer.MAX_VALUE){
                    result = Math.min(result , len + minTillIdx[i-1] );
                }

                bestMinLen = Math.min(len , bestMinLen);
            }
            minTillIdx[j] = bestMinLen;
            j++;
        }
                
        return result == Integer.MAX_VALUE ? -1 : result;
    }
}
