class Solution {
    public int largestInteger(int[] nums, int k) {
    
    
    int n = nums.length;
    int[] a = new int[51];
    for(int num : nums){
            a[num]++;
        }

    int max = -1;

if(k == 1){
    for(int num : nums){
        if(a[num] == 1){
        max = Math.max(max,num);
    }
    }
        return max;
          }
if(k == n){
    for(int num : nums){
        max = Math.max(max,num); //nums[i] = num 
    }
    return max;
}
if(1<k && k<n){
    if(a[nums[0]] == 1){
        max = Math.max(max,nums[0]);
    }

    if(a[nums[n-1]] == 1){
        max = Math.max(max , nums[n-1]);
    }
return max;
}

return -1;

        }
    
    }

