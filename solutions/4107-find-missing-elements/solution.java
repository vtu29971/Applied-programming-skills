class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));
    
    List<Integer> nam = new ArrayList<>();

    int end = nums[nums.length-1], index = 0 , curr = nums[0];

    while(curr < end){
        if(nums[index] == curr){
            curr++;
            index++;
            continue;
        }
        else{
            while(curr < nums[index]){
                nam.add(curr++);
            }
            curr++;
            index++;
        }
    }
return nam;

    }
}
