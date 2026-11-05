class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {

        boolean flag = true;
        int count = 0;

        for(int i : arr1){
            for(int j : arr2){
                if(Math.abs(i-j) <= d){
                    flag = false;
                    break;
                }
            }
            if(flag){count++;}
            flag = true;
        }
        return count;
    }
}
