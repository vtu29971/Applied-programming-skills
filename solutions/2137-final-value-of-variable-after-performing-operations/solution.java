class Solution {
    public int finalValueAfterOperations(String[] op) {
        
        int s = op.length;
        int sum = 0;
        
        for(int i = 0 ; i < s ; i++){
            sum = op[i].charAt(1) == '+' ? sum+1 : sum-1;
        }

        return sum;
    }
}
