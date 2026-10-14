class Solution {
    public int[] minOperations(String boxes) {

        int n = boxes.length();
        int[] list = new int[n];

        int sum = 0;

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(boxes.charAt(j) == '1'){
                sum += Math.abs(i-j);
                }
            }
            list[i] = sum;
            
            sum = 0;
        }
        
        return list;

    }
}
