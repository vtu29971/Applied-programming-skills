class Solution {
    public int minimumDeletions(int[] nums) {

        if( nums.length == 1){
            return 1;
        }
        else if(nums.length == 2){
            return 2;
        }
        int max = -100000;
        int min = 100000;
        int a = -1 , b = -1 , c = -1;

        for(int i = 0 ; i <= nums.length - 1 ; i++ ){
            if (nums[i] <= min){
                min = nums[i];
                a = i;
            }
            if ( nums[i] >= max){
                max = nums[i];
                b = i;
            }

        }
        if( a < b){
            c = b -a ;
            a++;
            b = nums.length - b ;
        }

        else{
            c = a - b;
            b++;
            a = nums.length - a ;
        }
        return Math.min(a+b , Math.min(b+c , a+c));
    }
}
